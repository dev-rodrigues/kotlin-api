package com.rodrigues.demo.transportLayers.api

import com.rodrigues.demo.domain.Book
import com.rodrigues.demo.transportLayers.dto.CreateBook
import com.rodrigues.demo.transportLayers.mappers.BookMapper
import com.rodrigues.demo.usecases.CreateBookUseCase
import org.mapstruct.factory.Mappers
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/book")
class BookApi constructor(val createBookUseCase:CreateBookUseCase) {

    val bookMapper: BookMapper = Mappers.getMapper(BookMapper::class.java)

    @GetMapping
    fun list():List<Book> {
        return listOf(Book("Harry Potter", "J. K. Rowling"), Book("Pinóquio", "Carlo Collodi"))
    }

    @PostMapping
    fun create(createBook: CreateBook): ResponseEntity<Book>? {
        val book = this.bookMapper.map(createBook)
        return ResponseEntity.ok(this.bookMapper.map(createBookUseCase.execute(book)!!))
    }
}