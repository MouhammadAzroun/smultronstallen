package com.example.smultronstallen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AddPlaceActivity : AppCompatActivity() {
    lateinit var newHeading : EditText
    lateinit var newInfo : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_place)

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

        DataManager.placeList.add(Place(heading, info))
    }
}