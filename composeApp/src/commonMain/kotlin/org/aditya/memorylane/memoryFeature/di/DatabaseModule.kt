package org.aditya.memorylane.memoryFeature.di

import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.aditya.memorylane.getDatabaseBuilder
import org.aditya.memorylane.memoryFeature.data.repository.MemoryDatabase

import org.koin.dsl.module

val databaseModule = module {

    // database
    single {
        getRoomDatabase(getDatabaseBuilder())
    }

}

fun getRoomDatabase(
    builder: RoomDatabase.Builder<MemoryDatabase>
): MemoryDatabase {

    return builder
        //.fallbackToDestructiveMigrationOnDowngrade(true)
        .setDriver(BundledSQLiteDriver())
        .setQueryCoroutineContext(Dispatchers.IO)
        .build()
}