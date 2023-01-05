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
    lateinit var headingView : EditText
    lateinit var infoView : EditText
    lateinit var latView : EditText
    lateinit var langView : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_place)

        auth = Firebase.auth
        db = Firebase.firestore
        headingView = findViewById(R.id.headingEditText)
        infoView = findViewById(R.id.infoEditText)
        latView = findViewById(R.id.latEditText)
        langView = findViewById(R.id.langEditText)

        val saveButton = findViewById<Button>(R.id.saveButton)
        saveButton.setOnClickListener {
            createNewPlace()
            finish()
        }

    }

    private fun createNewPlace(){
        val heading = headingView.text.toString()
        val info = infoView.text.toString()
        val lat = latView.text.toString().toDoubleOrNull()
        val lang = langView.text.toString().toDoubleOrNull()

        val currentUser = auth.currentUser
        if(currentUser != null){
            val newPlace = Place(heading = heading, info = info, lat = lat, lang = lang)
            DataManager.placeList.add(newPlace)
            db.collection("Users").document(currentUser.uid)
                .collection("Places").add(newPlace)
        }
    }
}