package com.example.tp.bo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate

@Parcelize
data class Article(
    var id: Long,
    var intitule : String,
    var description: String,
    var prix : Double,
    var niveau: Byte,
    var url: String?,
    var achete: Boolean?,
    var dataAchat: LocalDate?
) : Parcelable
