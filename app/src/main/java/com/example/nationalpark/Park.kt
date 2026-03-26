package com.example.nationalpark

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import java.sql.Date

@Entity
data class Park(
    @PrimaryKey val id: Int,
    val name: String,
    val founded: Int,
    val state: String,
)

class TypeConverter {
    @TypeConverter
    fun fromDate(date : Date) : Long {
        return date.time
    }

    @TypeConverter
    fun toDate(ms : Long): Date {
        return Date(ms)
    }
}