package com.dam.ye.examenunidad3

import android.app.Application
import androidx.room.Room

class AlumnoApplication : Application() {

    companion object {
        lateinit var database : AlumnoDatabase
    }

    override fun onCreate() {
        super.onCreate()

        //Esta comentado porque marca error

       /* database = Room.databaseBuilder(this,
            AlumnoDatabase::class.java,
            "Alumno_Database"
        ).build() */
    }
}