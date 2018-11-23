package eli.supersql

import java.sql.Connection
import java.sql.ResultSet
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZonedDateTime

class SuperSQLSelect(sql: String) {
    val parameters: MutableMap<Int, Object> = HashMap()
    var indexCounter: Int = 1

    fun withParam(value: Boolean): SuperSQLSelect {
        return this
    }

    fun withParam(value: Short): SuperSQLSelect {
        return this
    }

    fun withParam(value: Int): SuperSQLSelect {
        return this
    }

    fun withParam(value: Long): SuperSQLSelect {
        return this
    }

    fun withParam(value: Char): SuperSQLSelect {
        return this
    }

    fun withParam(value: String): SuperSQLSelect {
        return this
    }

    fun withParam(value: LocalDate): SuperSQLSelect {
        return this
    }

    fun withParam(value: LocalDateTime): SuperSQLSelect {
        return this
    }

    fun withParam(value: ZonedDateTime): SuperSQLSelect {
        return this
    }

    fun <T> withParam(value: Collection<T>): SuperSQLSelect {
        return this
    }

    fun <T : SuperSQLResult<T>> execute(connection: Connection, resultFactory: (ResultSet) -> T): List<T> {
        return listOf()
    }
}