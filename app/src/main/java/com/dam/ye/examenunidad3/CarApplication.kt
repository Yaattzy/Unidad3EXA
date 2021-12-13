package com.dam.ye.examenunidad3

import android.app.Application
import androidx.room.Room

class CarApplication : Application() {

    companion object {
        lateinit var database : CarDatabase
    }

    override fun onCreate() {
        super.onCreate()

        //Esta comentado porque marca error

      /*  database = Room.databaseBuilder(this,
            CarDatabase::class.java,
            "Car_Database"
        ).build() */
    }
}