package com.example.tplancerde

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceVM : ViewModel() {
    var dice = MutableLiveData(0)

    fun launchDice(faceMax: Int) {
        dice.value = (1..faceMax).random()
    }
}