package com.example.nationalpark

import androidx.room.Database
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [ Park::class], version=1)
@TypeConverters(TypeConverter::class)
class ParkDatabase : RoomDatabase() {
    override fun createInvalidationTracker(): InvalidationTracker {
        TODO("Not yet implemented")
    }

    override fun clearAllTables() {
        TODO("Not yet implemented")
    }


}