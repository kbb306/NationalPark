package com.example.nationalpark

import android.content.Context
import androidx.room.Room
import kotlinx.coroutines.flow.Flow

class ParkRepository  private constructor(context: Context) {
    private val db : ParkDatabase = Room
        .databaseBuilder(context.applicationContext,
            ParkDatabase::class.java,
            "park-database")
        .createFromAsset("park-database.db")
        .build()
    companion object {
        private var INSTANCE : ParkRepository? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = ParkRepository(context)
            }
        }
        fun get() : ParkRepository {
            return INSTANCE ?: throw IllegalStateException()
        }
    }
    fun getParks() : Flow<List<Park>> = db.dao().getParks()

    suspend fun getPark(id : Int) : Park = db.dao().getPark(id)


}