package com.example.mod4findview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mod4findview.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //val textView = findViewById<TextView>(R.id.textView)
        activityMainBinding.textView2.text = "Hello World 😊😊"
        activityMainBinding.textView.textSize = 25f
        activityMainBinding.user=User(
            "Jean-Paul",
            "RIVERAU",
            48)
        //val button = findViewById<Button>(R.id.button)

        activityMainBinding.button.setOnClickListener {
            Toast.makeText(this, "hello world", Toast.LENGTH_SHORT).show()
            it.isEnabled = false
            Snackbar.make(it,"Hello World",Snackbar.LENGTH_SHORT).show()
        }
    }
}









