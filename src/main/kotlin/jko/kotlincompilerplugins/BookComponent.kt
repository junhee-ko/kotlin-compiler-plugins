package jko.kotlincompilerplugins

import org.springframework.stereotype.Component

@Component
class BookComponent(
    private val name: String = "kotlin",
    private val number: Long = 84219
)
