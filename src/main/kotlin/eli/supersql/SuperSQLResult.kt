package eli.supersql

import java.sql.ResultSet

interface SuperSQLResult<T: SuperSQLResult<T>> {
    fun of(results: ResultSet): List<T>
}