package org.aditya.memorylane

import android.app.Application
import android.os.Build
import androidx.room.Room
import androidx.room.RoomDatabase
import org.aditya.memorylane.memoryFeature.data.repository.MemoryDatabase
import org.aditya.memorylane.utils.DB_Name
import org.koin.mp.KoinPlatform

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()




actual fun getDatabaseBuilder(): RoomDatabase.Builder<MemoryDatabase> {
    val appContext = KoinPlatform.getKoin().get<Application>()
    val dbFile = appContext.getDatabasePath(DB_Name)
    return Room.databaseBuilder<MemoryDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}