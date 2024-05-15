@file:Suppress("ktlint:standard:filename")

package red.razvan.kontacts.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class Contact(
    @PrimaryKey
    val id: String = uuid(),
    val name: String,
)

internal expect fun uuid(): String
