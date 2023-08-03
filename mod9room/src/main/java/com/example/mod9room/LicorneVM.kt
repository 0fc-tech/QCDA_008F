package com.example.mod9room

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras

class LicorneVM(val licorneDao: LicorneDao) : ViewModel() {
    val sylvain = licorneDao.getById(1)

    companion object{
        val Factory : ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
                val licorneDao = LicorneDatabase.getInstance(
                    requireNotNull(extras[APPLICATION_KEY]).applicationContext
                ).licorneDao()
                return LicorneVM(licorneDao) as T
            }
        }
    }

}