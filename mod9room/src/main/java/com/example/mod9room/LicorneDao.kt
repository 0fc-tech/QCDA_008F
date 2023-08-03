package com.example.mod9room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface LicorneDao {
    @Insert
    fun insert(licorne: Licorne)

    @Query("SELECT * FROM Licorne WHERE id=:id")
    fun getById(id: Long): Licorne

    @Query("SELECT * FROM Licorne")
    fun getAll() : List<Licorne>

    @Query("SELECT * FROM Licorne WHERE tailleCorne = :length")
    fun getLicornesByHornLength(length: Int) : List<Licorne>

    @Update
    fun update(licorne: Licorne)
}




