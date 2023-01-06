package com.example.smultronstallen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    lateinit var auth : FirebaseAuth
    lateinit var emailView : EditText
    lateinit var passwordView : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = Firebase.auth
        emailView = findViewById(R.id.EmailEditText)
        passwordView = findViewById(R.id.PasswordEditText)

        val signUpButton = findViewById<Button>(R.id.SignUpButton)
        signUpButton.setOnClickListener{
            signUp()
        }

        val signInButton = findViewById<Button>(R.id.SignInButton)
        signInButton.setOnClickListener{
            signIn()
        }

        if(auth.currentUser != null){
            gotToBaseActivity()
        }
    }

    fun gotToBaseActivity(){
        val intent = Intent(this, BaseActivity::class.java)
        startActivity(intent)
    }

    private fun signIn(){
        val email = emailView.text.toString()
        val password = passwordView.text.toString()

        if (email.isEmpty()|| password.isEmpty()){
            Toast.makeText(this, "Please fill email and password fields!", Toast.LENGTH_SHORT).show()
            return
        }
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener{ task ->
                if (task.isSuccessful){
                    gotToBaseActivity()
                }else{
                    Toast.makeText(this, "Email or password is wrong!", Toast.LENGTH_SHORT).show()
                }

            }

    }

    private fun signUp(){
        val email = emailView.text.toString()
        val password = passwordView.text.toString()

        if (email.isEmpty()|| password.isEmpty()){
            return
        }
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener{ task ->
                if (task.isSuccessful){
                    Toast.makeText(this, "account created successfully!", Toast.LENGTH_SHORT).show()
                    gotToBaseActivity()
                }else{
                    Toast.makeText(this, "Please enter a valid email address!", Toast.LENGTH_SHORT).show()
                }

            }
    }
}