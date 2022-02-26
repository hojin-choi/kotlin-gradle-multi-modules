package dev.hojin.domain.entity

data class AstroResult(
    val message: String,
    val number: String,
    val people: List<Assignment>
)

data class Assignment(
    val craft: String,
    val name: String
)
