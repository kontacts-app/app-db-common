package red.razvan.kontacts.db

import platform.Foundation.NSUUID

internal actual fun uuid(): String = NSUUID.UUID().UUIDString
