package dev.hojin.domain.service

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.concurrent.Executors
import kotlin.random.Random

fun sampleRunBlocing() = runBlocking {
    print("Hello, ")
    delay(3000L)
    println("World")
}

suspend fun add(x: Int, y: Int): Int {
    delay(5000L)
    return x + y
}

suspend fun sampleAsyncFunc() = coroutineScope {
    val firstSum = async {
        println(Thread.currentThread().name)
        add(2, 2)
    }

    val secondSum = async {
        println(Thread.currentThread().name)
        add(3, 4)
    }
    println("Awaiting concurrent sums...")
    val total = firstSum.await() + secondSum.await()
    println("total is $total")
}

suspend fun retrive(url: String) = withContext(Dispatchers.IO) {
    println("Retrieving data on ${Thread.currentThread().name}")
    delay(100L)
    "withContextResults"
}

// fun main() {
//     println("Before creating coroutine")
//     sampleRunBlocing()
//     println("After coroutine is finishied")
// }

// suspend fun main() {
//     sampleAsyncFunc()
// }

// fun main() = runBlocking<Unit> {
//     val result = retrive("www.test.com")
//     println(result)
// }

fun main() = runBlocking<Unit> {
    Executors.newFixedThreadPool(10).asCoroutineDispatcher().use {
        withContext(it) {
            delay(100L)
            println(Thread.currentThread().name)
        }
    }
}
