class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val maxCandy = candies.maxOrNull() ?: 0
        return candies.map { it + extraCandies >= maxCandy }
    }
}