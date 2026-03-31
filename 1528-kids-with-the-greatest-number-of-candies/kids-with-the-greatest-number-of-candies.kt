class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val result = mutableListOf<Boolean>()
        var maxCandy = candies[0]
        candies.forEach {candy ->
            if (candy > maxCandy) {
                maxCandy = candy
            }
        }
        candies.forEach { candy ->
            result.add(
                candy + extraCandies >= maxCandy
            )   
        }
        return result
    }
}