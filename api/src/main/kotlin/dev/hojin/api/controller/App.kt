package dev.hojin.api.controller

class App

fun main() {
    val keys = 'a'..'f'
    val map = keys.associateWith { it.toString().repeat(5) }
    println(map)
}
