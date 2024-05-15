package red.razvan.kontacts.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.driver.AndroidSQLiteDriver

class AndroidKontactsDatabaseBuilderFactory(
    private val context: Context,
) : KontactsDatabaseBuilderFactory {
    override fun create(): RoomDatabase.Builder<KontactsDatabase> =
        Room
            .databaseBuilder<KontactsDatabase>(
                context = context.applicationContext,
                name = context.applicationContext.getDatabasePath("kontacts.db").absolutePath,
            )
            .setDriver(AndroidSQLiteDriver())
}
