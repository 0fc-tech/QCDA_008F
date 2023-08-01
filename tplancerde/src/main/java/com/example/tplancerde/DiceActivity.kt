package com.example.tplancerde

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.tplancerde.databinding.ActivityDiceBinding

class DiceActivity : AppCompatActivity() {
    lateinit var binding : ActivityDiceBinding
    //Récupération instance VM
    val vm by viewModels<DiceVM>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dice)
        binding.vm = vm
        //Permet au binding d'observer les changements de données des livedata
        binding.lifecycleOwner = this
        vm.dice.observe(this){valueDice->
            if(valueDice>10)
                binding.textViewValueDice.setTextColor(getColor(android.R.color.holo_green_dark))
            else
                binding.textViewValueDice.setTextColor(getColor(android.R.color.black))
        }
    }
}