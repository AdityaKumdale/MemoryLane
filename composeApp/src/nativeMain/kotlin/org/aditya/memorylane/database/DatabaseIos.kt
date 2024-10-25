package org.aditya.memorylane.database

import androidx.room.Room
import androidx.room.RoomDatabase
import org.aditya.memorylane.memoryFeature.data.repository.AppDatabase

fun getDatabaseBuilderIos(): RoomDatabase.Builder<AppDatabase> {
    val dbFilePath = NSHomeDirectory() + "/my_room.db"
    return Room.databaseBuilder<AppDatabase>(
        name = dbFilePath,
        factory =  { AppDatabase::class.instantiateImpl() }  // IDE may show error but there is none.
    )
}