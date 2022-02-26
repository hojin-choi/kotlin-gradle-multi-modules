package dev.hojin.domain.service

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.contains
import org.junit.jupiter.api.Test

class WindowTest {
    val range = 0..10

    @Test
    fun `chunk test`() {
        val chunked = range.chunked(3)
        assertThat(chunked, contains(listOf(0, 1, 2), listOf(3, 4, 5), listOf(6, 7, 8), listOf(9, 10)))
    }

    @Test
    fun `window test`() {
        val windowed = range.windowed(3, 2)
        assertThat(windowed, contains(listOf(0, 1, 2), listOf(2, 3, 4), listOf(4, 5, 6), listOf(6, 7, 8), listOf(8, 9, 10)))
    }
}
