package red.razvan.kontacts.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [Contact::class],
    exportSchema = false,
)
abstract class KontactsDatabase : RoomDatabase() {
    abstract fun contactsDao(): ContactsDao
}
