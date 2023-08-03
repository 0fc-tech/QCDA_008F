package com.example.mod5menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Interprète le fichier ressource Menu et "inflate" dans le "menu"
        menuInflater.inflate(R.menu.menu_app_bar_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
                            //toast
            R.id.menu_add-> Toast.makeText(
                this,
                "Ajouter",
                Toast.LENGTH_LONG).show()
            R.id.menu_edit-> Snackbar.make(
                findViewById(R.id.constraintMenu),
                "Edit",
                Snackbar.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}




