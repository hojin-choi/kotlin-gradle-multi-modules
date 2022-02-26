package dev.hojin.domain.service

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class DestructuringTest {
    @Test
    fun `destructuring test`() {
        // 최대 5개 까지만 destructuring 가능
        val (a, b, c, d, e) = listOf("1", "2", "3", "4", "5", "6")

        assertThat(a, `is`("1"))
        assertThat(b, `is`("2"))
        assertThat(c, `is`("3"))
        assertThat(d, `is`("4"))
        assertThat(e, `is`("5"))
    }
}
