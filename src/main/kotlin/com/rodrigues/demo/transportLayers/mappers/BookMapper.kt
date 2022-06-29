package com.rodrigues.demo.transportLayers.mappers

import com.rodrigues.demo.domain.Book
import com.rodrigues.demo.transportLayers.dto.CreateBook
import org.mapstruct.Mapper

@Mapper
interface BookMapper {

    fun map(createBook:CreateBook): Book

    fun map(book:Book):CreateBook
}