package red.razvan.kontacts.db

import androidx.room.RoomDatabase

interface KontactsDatabaseBuilderFactory {
    fun create(): RoomDatabase.Builder<KontactsDatabase>
}
