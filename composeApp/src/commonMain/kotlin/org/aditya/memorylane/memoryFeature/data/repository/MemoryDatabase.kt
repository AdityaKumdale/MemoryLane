package org.aditya.memorylane.memoryFeature.data.repository

import androidx.room.Database
import androidx.room.RoomDatabase
import org.aditya.memorylane.memoryFeature.domain.models.Memory

@Database(entities = [Memory::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    //abstract fun getDao
}
