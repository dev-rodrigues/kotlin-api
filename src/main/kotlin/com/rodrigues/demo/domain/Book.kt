package com.rodrigues.demo.domain

import java.util.Calendar
import java.util.UUID

class Book(name:String, author:String) {
    val id = UUID.randomUUID().toString()
    val bookName = name.uppercase()
    val authorName = author.uppercase()
    val createdAt = Calendar.getInstance()
}