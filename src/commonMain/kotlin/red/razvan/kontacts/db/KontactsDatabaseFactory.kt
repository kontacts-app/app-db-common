package red.razvan.kontacts.db

import androidx.room.RoomDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

object KontactsDatabaseFactory {
    fun create(builder: RoomDatabase.Builder<KontactsDatabase>): KontactsDatabase =
        builder
            .fallbackToDestructiveMigrationOnDowngrade(true)
            .setQueryCoroutineContext(Dispatchers.IO)
            .build()
}
