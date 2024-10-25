package org.aditya.memorylane.memoryFeature.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import org.aditya.memorylane.Uri
import org.aditya.memorylane.memoryFeature.data.converters.UriTypeConverter

@Entity(tableName = "memories")
@TypeConverters(UriTypeConverter::class)
data class Memory(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String,
    val mediaPath: Uri,
    val mediaType: MediaType,
    val timestamp: Long
)

enum class MediaType {
    PHOTO, VIDEO, AUDIO
}