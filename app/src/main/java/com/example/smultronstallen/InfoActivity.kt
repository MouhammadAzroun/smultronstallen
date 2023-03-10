package com.example.smultronstallen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView


const val PLACE_POSITION_KEY = "PLACE_POSITION"
const val PLACE_NOT_SET = -1
class InfoActivity : AppCompatActivity() {
    lateinit var infoTV : TextView
    lateinit var titleTv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        infoTV = findViewById(R.id.infoTextView)
        titleTv = findViewById(R.id.titelTextView)


        val position = intent.getIntExtra(PLACE_POSITION_KEY, PLACE_NOT_SET)
        val place = DataManager.placeList[position]
        titleTv.text = place.heading
        infoTV.text = place.info


        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
        val mapButton = findViewById<ImageButton>(R.id.mapImageButton)
        mapButton.setOnClickListener{
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra(PLACE_POSITION_KEY, position)
            startActivity(intent)
        }
    }
}