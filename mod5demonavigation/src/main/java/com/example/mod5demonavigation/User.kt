package com.example.mod5demonavigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(val email: String, val password: String) : Parcelable
