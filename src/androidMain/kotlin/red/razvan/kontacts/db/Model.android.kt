package red.razvan.kontacts.db

import java.util.UUID

internal actual fun uuid(): String = UUID.randomUUID().toString()
