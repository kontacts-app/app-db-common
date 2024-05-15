package red.razvan.kontacts.db

import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.driver.NativeSQLiteDriver
import platform.Foundation.NSHomeDirectory

object AppleKontactsDatabaseBuilderFactory : KontactsDatabaseBuilderFactory {
    override fun create(): RoomDatabase.Builder<KontactsDatabase> =
        Room.databaseBuilder<KontactsDatabase>(
            name = NSHomeDirectory() + "/kontacts.db",
            factory = {
                KontactsDatabase::class.instantiateImpl()
            },
        )
            .setDriver(NativeSQLiteDriver())
}
