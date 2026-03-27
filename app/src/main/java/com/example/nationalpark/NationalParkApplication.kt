package com.example.nationalpark

import android.app.Application

class ParkApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ParkRepository.initialize(this)
    }
}