package org.aditya.memorylane.memoryFeature.data.converters

import androidx.room.TypeConverter
import org.aditya.memorylane.Uri

class UriTypeConverter {
    @TypeConverter
    fun fromUri(uri: Uri): String = uri.fullUri

    @TypeConverter
    fun toUri(uriString: String): Uri = Uri.fromString(uriString)
}
