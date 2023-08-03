package com.example.mod9room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlin.concurrent.thread

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    val vm by viewModels<LicorneVM> { LicorneVM.Factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Toast.makeText(this, vm.toString(), Toast.LENGTH_SHORT).show()
        Toast.makeText(this, vm.sylvain.toString(), Toast.LENGTH_SHORT).show()
        //thread {
        //    LicorneDatabase.getInstance(this).licorneDao().insert(
        //        Licorne(0,"Sylvain",5,"Rose")
        //    )
        //}

    }
}