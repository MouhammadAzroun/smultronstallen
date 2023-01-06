package com.example.smultronstallen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class BaseActivity : AppCompatActivity() {

    lateinit var db : FirebaseFirestore
    lateinit var auth : FirebaseAuth
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        db = Firebase.firestore
        auth = Firebase.auth

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val currentUser = auth.currentUser
        if(currentUser != null){
            val docRef = db.collection("Users").document(currentUser.uid).collection("Places")
            docRef.get().addOnSuccessListener { documentSnapShot ->
                for(document in documentSnapShot.documents) {
                    val place = document.toObject<Place>()
                    if(place != null){
                        DataManager.placeList.add(place)
                    }
                }
                recyclerView.adapter = RecyclerViewAdapter(this, DataManager.placeList)
            }
        }


        val newPlaceBtn = findViewById<Button>(R.id.addPlaceButton)
        newPlaceBtn.setOnClickListener {
            val intent = Intent(this, AddPlaceActivity :: class.java)
            startActivity(intent)
        }

        val signOutButton = findViewById<ImageButton>(R.id.signOutImageButton)
        signOutButton.setOnClickListener{
            auth.signOut()
            finish()
        }
    }

    override fun onResume() {
        super.onResume()

        recyclerView.adapter?.notifyDataSetChanged()
    }

    fun retrievePlaces (){
    }
}