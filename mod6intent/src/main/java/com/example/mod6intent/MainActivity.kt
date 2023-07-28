package com.example.mod6intent

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    val requestPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()){
            if(it){
                val dial911 = Intent(Intent.ACTION_CALL, Uri.parse("tel:+1911"))
                startActivity(dial911)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                                    //Intent Explicite
        val intentSettings = Intent(this,SettingsActivity::class.java)
        val dial911 = Intent(Intent.ACTION_DIAL, Uri.parse("tel:911"))

        findViewById<Button>(R.id.buttonExplicite).setOnClickListener {
            startActivity(intentSettings)
        }
        findViewById<Button>(R.id.buttonImplicite).setOnClickListener {
            startActivity(dial911)
        }
        findViewById<Button>(R.id.buttonPermission).setOnClickListener {
            requestPermissionLauncher.launch(Manifest.permission.CALL_PHONE)
        }


    }
}







