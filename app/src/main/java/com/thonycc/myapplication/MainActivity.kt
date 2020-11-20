package com.thonycc.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtEmail = findViewById<EditText>(R.id.edtEmail);
        val buttonLogin = findViewById<Button>(R.id.btnLogin);
        buttonLogin.setOnClickListener{
            val email = edtEmail.text.toString()
            Toast.makeText(this, "Logged user with $email", Toast.LENGTH_SHORT).show()
        }
    }
}