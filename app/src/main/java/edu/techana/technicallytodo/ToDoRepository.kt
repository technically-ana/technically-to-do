package edu.techana.technicallytodo

class ToDoRepository {
    var items = listOf<ToDoModel>(
        ToDoModel(
            description = "Make coffee.",
            isCompleted = false,
            notes = "There is no day without coffee <3"
        ),
        ToDoModel(description = "Complete one section of a book."),
        ToDoModel(
            description = "Write an app.",
            notes = "Just don't overthink it."
            )
    )
}