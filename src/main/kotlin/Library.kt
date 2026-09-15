import javax.xml.transform.sax.SAXResult

data class Book(
    val isbn: String,
    val title: String,
    val year: Int,
    val authors: Set<Author>
) {
    fun hasAuthor(nif: String): Boolean =
        authors.any { a -> a.nif == nif }
}

data class Author(
    val nif: String,
    val name: String,
    val surname: String
)

data class Library(
    val name: String,
    val books: List<Book>
) {
    fun hasBook(isbn: String): Boolean =
        books.any { b -> b.isbn == isbn }

    fun hasAuthor(authorNif: String): Boolean =
        books.any { b -> b.hasAuthor(authorNif) }

    fun countBooks(authorNif: String): Int =
        books.count { b -> b.hasAuthor(authorNif) }

    fun countYearBooks(year: Int): Int =
        books.count { b -> b.year == year }
}
