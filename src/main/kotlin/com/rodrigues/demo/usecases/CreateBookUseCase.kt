package com.rodrigues.demo.usecases

import com.rodrigues.demo.domain.Book
import com.rodrigues.demo.transportLayers.dto.CreateBook
import org.springframework.stereotype.Service

@Service
class CreateBookUseCase {

    fun execute(book: Book):CreateBook? {
        // notify creation of book in kafka topic
        // persist book in database
        // logget creation of book
        return null;
    }
}