package org.aditya.memorylane.memoryFeature.domain

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "memoryTable")
data class Memory(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val mediaPath: String,
    val mediaType: String,
    val timestamp: String
)