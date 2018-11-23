package eli.supersql

class ParamParser(sql: String) {
    val PARAM_SINGLE_PATTERN = """[^("]*\?[^)"]*"""
    val PARAM_COLLECTION_PATTERN = """(\s*\?\s*)"""
    val PARAM_TUPLE_PATTERN = """(\?\(,\?\)+)"""
}