package org.aditya.memorylane.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import org.aditya.memorylane.memoryFeature.data.repository.AppDatabase

fun getDatabaseBuilderAndroid(ctx: Context): RoomDatabase.Builder<AppDatabase> {
    val appContext = ctx.applicationContext
    val dbFile = appContext.getDatabasePath("my_room.db")
    return Room.databaseBuilder<AppDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}