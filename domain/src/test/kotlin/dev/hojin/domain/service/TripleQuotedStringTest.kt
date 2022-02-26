package dev.hojin.domain.service

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class TripleQuotedStringTest {

    @Test
    fun `3중 따옴표`() {
        val tripleQuotedString = """
            hello
            world
                안녕
                    하세요
        """.trimIndent()

        val expectedString = "hello\nworld\n    안녕\n        하세요"

        assertThat(tripleQuotedString, `is`(expectedString))
    }
}
