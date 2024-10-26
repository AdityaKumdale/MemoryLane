package org.aditya.memorylane.memoryFeature.domain

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.flowOn
import org.aditya.memorylane.memoryFeature.data.dao.MemoryDao


class LocalMemoryRepository(
    private val memoryDao: MemoryDao
) {
    suspend fun insertMemory(memory: Memory) {
        memoryDao.insert(memory)
    }

    fun getMemories() = memoryDao.getAllAsFlow().flowOn(Dispatchers.IO)

    suspend fun getMemory(id: Int): Memory {
        return memoryDao.getById(id = id.toString())
    }
}