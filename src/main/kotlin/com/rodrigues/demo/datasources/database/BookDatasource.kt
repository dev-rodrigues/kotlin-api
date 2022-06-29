package com.rodrigues.demo.datasources.database

import com.rodrigues.demo.domain.Book
import com.rodrigues.demo.ports.BookRepository
import org.springframework.stereotype.Component

@Component
class BookDatasource:BookRepository {
    override fun save(book: Book): Book {
        TODO("Not yet implemented")
    }
}