package com.example.mod9room

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.After
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LicorneDbTest {
    init {
        getDb()
    }
    companion object{
        lateinit var db : LicorneDatabase
        @BeforeClass
        fun getDb() {
            db = Room.inMemoryDatabaseBuilder(
                InstrumentationRegistry.getInstrumentation().context,
                LicorneDatabase::class.java
            ).build()
        }
    }



    @Test
    fun checkInsertDB(){
        db.licorneDao().insert(Licorne(0,"JeanMichel",10,"Rose"))
        assert(db.licorneDao().getById(1).nom == "JeanMichel")
    }
    @Test
    fun checkInsertDB2(){
        db.licorneDao().insert(Licorne(0,"JeanMichel2",8,"Vert"))
        assert(db.licorneDao().getById(1).robe == "Vert")
    }
    @After
    fun deco(): Unit {
        db.close()
    }
}