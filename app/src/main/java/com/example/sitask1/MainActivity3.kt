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

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val signUpButton : Button = findViewById(R.id.signUpButton)
        val emailEditText : EditText = findViewById(R.id.emailEditText)
        val passwordEditText : EditText = findViewById(R.id.passwordEditText)

        signUpButton.setOnClickListener {
            val createPasswordEditText : EditText = findViewById(R.id.createPasswordEditText)
            val emailCheck = emailEditText.text.toString()
            val passwordCheck = passwordEditText.text.toString()
            val createPCheck = createPasswordEditText.text.toString()
            val intent5 = Intent(this, MainActivity2::class.java)
            if(emailCheck.isEmpty() || passwordCheck.isEmpty() || createPCheck.isEmpty()){
                Toast.makeText(this, "Fill out all the fields to continue !!!", Toast.LENGTH_SHORT).show()
            }
            else{
                startActivity(intent5)
                Toast.makeText(this, "Registration Successful! Please Login to continue", Toast.LENGTH_LONG).show()
            }
        }
        val alreadyAccount : TextView = findViewById(R.id.alreadyHaveAccountTextView)
        alreadyAccount.setOnClickListener {
            val intent6 = Intent(this, MainActivity2::class.java)
            startActivity(intent6)
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