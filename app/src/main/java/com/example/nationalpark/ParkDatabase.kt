package com.example.nationalpark

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [ Park::class], version=1)
@TypeConverters(TypeConverter::class)
abstract class ParkDatabase : RoomDatabase() {
    abstract fun dao() : ParkDao


}