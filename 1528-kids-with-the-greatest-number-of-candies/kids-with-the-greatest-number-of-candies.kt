class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var result = MutableList(candies.size) { false }
        var maxCandy = candies.get(0)
        candies.forEach {candy ->
            if (candy > maxCandy) {
                maxCandy = candy
            }
        }
        candies.forEachIndexed { index, candy ->
            if (candy + extraCandies >= maxCandy) {
                result.set(index, true)
            }
        }
        return result
    }
}