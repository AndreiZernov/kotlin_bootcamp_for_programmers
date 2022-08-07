package Book

open class Book (val title: String, val author: String) {
    private var currentPage = 1
    open fun readPage() { currentPage++ }
}

class eBook(): Book {
    private var wordsRead = 0
    override fun readPage() { wordsRead += 250 }
}