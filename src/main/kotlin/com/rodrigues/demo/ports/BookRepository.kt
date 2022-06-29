package com.rodrigues.demo.ports

import com.rodrigues.demo.domain.Book

interface BookRepository {
    fun save(book: Book): Book
}