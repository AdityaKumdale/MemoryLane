package org.aditya.memorylane.memoryFeature.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import org.aditya.memorylane.memoryFeature.domain.Memory


@Dao
interface MemoryDao {

    @Insert(entity = Memory::class)
    suspend fun insert(memory: Memory)

    @Query("SELECT * FROM memoryTable WHERE id = :id")
    suspend fun getById(id: String): Memory

    @Query("SELECT * FROM memoryTable")
    fun getAllAsFlow(): Flow<List<Memory>>
}
