package com.example.sitask1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val forgotPassword : TextView = findViewById(R.id.forgotPasswordTextView)
        forgotPassword.setOnClickListener {
            Toast.makeText(this, "You cannot login without password", Toast.LENGTH_LONG).show()
        }

        val createAccount : TextView = findViewById(R.id.createAccountTextView)
        createAccount.setOnClickListener{
            val intent3 = Intent(this,MainActivity3::class.java)
            startActivity(intent3)
        }
        val signInButton : Button = findViewById(R.id.signInButton)
        val emailEditText :EditText = findViewById(R.id.emailEditText)
        val passwordEditText :EditText = findViewById(R.id.passwordEditText)
        signInButton.setOnClickListener {
            val emailCheck = emailEditText.text.toString()
            val passwordCheck = passwordEditText.text.toString()
            val intent4 = Intent(this, MainActivity::class.java)
            if(emailCheck.isEmpty() || passwordCheck.isEmpty()){
                Toast.makeText(this, "Fill out all the fields to continue !!!", Toast.LENGTH_SHORT).show()
            }
            else{
                startActivity(intent4)
                Toast.makeText(this, "Logged In Successfully", Toast.LENGTH_LONG).show()
            }
        }
        val googleButton : ImageButton = findViewById(R.id.googleButton)
        googleButton.setOnClickListener{
            Toast.makeText(this, "This Feature is not available yet", Toast.LENGTH_SHORT).show()
        }
        val fbButton : ImageButton = findViewById(R.id.facebookButton)
        fbButton.setOnClickListener{
            Toast.makeText(this, "This Feature is not available yet", Toast.LENGTH_SHORT).show()
        }
        val iosButton : ImageButton = findViewById(R.id.iosButton)
        iosButton.setOnClickListener{
            Toast.makeText(this, "This Feature is not available yet", Toast.LENGTH_SHORT).show()
        }
    }
}