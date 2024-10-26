package org.aditya.memorylane.memoryFeature.di

import org.aditya.memorylane.memoryFeature.data.repository.MemoryDatabase
import org.aditya.memorylane.memoryFeature.domain.LocalMemoryRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        LocalMemoryRepository(get<MemoryDatabase>().memoryDao())
    }
}