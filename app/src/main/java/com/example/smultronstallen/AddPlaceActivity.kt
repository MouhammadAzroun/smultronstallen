package com.example.smultronstallen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class AddPlaceActivity : AppCompatActivity() {

    lateinit var db : FirebaseFirestore
    lateinit var auth : FirebaseAuth
    lateinit var newHeading : EditText
    lateinit var newInfo : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_place)

        auth = Firebase.auth
        db = Firebase.firestore
        newHeading = findViewById(R.id.headingEditText)
        newInfo = findViewById(R.id.infoEditText)

        val saveButton = findViewById<Button>(R.id.saveButton)
        saveButton.setOnClickListener {
            createNewPlace()
            finish()
        }

    }

    private fun createNewPlace(){
        val heading = newHeading.text.toString()
        val info = newInfo.text.toString()

        val currentUser = auth.currentUser
        if(currentUser != null){
            val newPlace = Place(heading= heading, info = info)
            DataManager.placeList.add(newPlace)
            db.collection("Users").document(currentUser.uid)
                .collection("Places").add(newPlace)
        }
    }
}