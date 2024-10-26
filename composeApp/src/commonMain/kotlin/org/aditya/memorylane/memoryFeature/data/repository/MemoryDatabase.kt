package org.aditya.memorylane.memoryFeature.data.repository

import androidx.room.Database
import androidx.room.RoomDatabase
import org.aditya.memorylane.memoryFeature.data.dao.MemoryDao
import org.aditya.memorylane.memoryFeature.domain.Memory

@Database(entities = [Memory::class], version = 1, exportSchema = false)
abstract class MemoryDatabase : RoomDatabase(){
    abstract fun memoryDao(): MemoryDao
}

