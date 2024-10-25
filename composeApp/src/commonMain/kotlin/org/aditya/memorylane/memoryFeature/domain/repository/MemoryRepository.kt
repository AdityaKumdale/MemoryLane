package org.aditya.memorylane.memoryFeature.domain.repository

import org.aditya.memorylane.memoryFeature.domain.models.Memory



interface MemoryRepository {

    suspend fun insert(noteModel: Memory): Result<Memory>

    suspend fun getById(id: String): Result<Memory>

    suspend fun getAll(): Result<List<Memory>>

}