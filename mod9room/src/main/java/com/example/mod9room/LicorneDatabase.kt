package com.example.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Licorne::class], version = 1)
abstract class LicorneDatabase : RoomDatabase() {
    //Nos daos
    abstract fun licorneDao(): LicorneDao

    companion object{
        @Volatile
        private var INSTANCE : LicorneDatabase? = null
        fun getInstance(context : Context): LicorneDatabase{
            synchronized(this){
                var instance = INSTANCE
                if (instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        LicorneDatabase::class.java,
                        "unicorn_db"
                    ).fallbackToDestructiveMigration()
                    .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}