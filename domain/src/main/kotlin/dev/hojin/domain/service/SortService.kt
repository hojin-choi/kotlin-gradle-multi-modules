package dev.hojin.domain.service

import dev.hojin.domain.entity.Golfer

class SortService {
    fun getGolferListSortedByScore(golferList: List<Golfer>): List<Golfer> {
        return golferList.sortedWith(compareBy({ it.score }, { it.lastName }, { it.firstName }))
    }
}
