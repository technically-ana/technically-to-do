package edu.techana.technicallytodo

import java.time.Instant
import java.util.UUID

data class ToDoModel (
    val id: String = UUID.randomUUID().toString(),
    val description: String,
    val isCompleted: Boolean = false,
    val notes: String = "",
    val createdOn: Instant = Instant.now()
)