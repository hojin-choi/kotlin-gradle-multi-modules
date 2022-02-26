package dev.hojin.domain.service

import dev.hojin.domain.entity.Golfer
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test

class SortServiceTest {

    private val service = SortService()

    @Test
    fun `점수 오름차순, 성 오름차순, 이름 오름차순으로 정렬한다`() {
        val golferList = listOf(
            Golfer(70, "Jack", "Nicklaus"),
            Golfer(68, "Tom", "Watson"),
            Golfer(68, "Bubba", "Watson"),
            Golfer(70, "Tiger", "Woods"),
            Golfer(68, "Ty", "Webb")
        )

        val expectedList = listOf(
            Golfer(68, "Bubba", "Watson"),
            Golfer(68, "Tom", "Watson"),
            Golfer(68, "Ty", "Webb"),
            Golfer(70, "Jack", "Nicklaus"),
            Golfer(70, "Tiger", "Woods"),
        )

        val result = service.getGolferListSortedByScore(golferList)
        assertThat(result, `is`(expectedList))
    }
}
