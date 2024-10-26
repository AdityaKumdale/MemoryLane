package org.aditya.memorylane

import androidx.room.RoomDatabase
import org.aditya.memorylane.memoryFeature.data.repository.MemoryDatabase

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform


expect fun getDatabaseBuilder() : RoomDatabase.Builder<MemoryDatabase>