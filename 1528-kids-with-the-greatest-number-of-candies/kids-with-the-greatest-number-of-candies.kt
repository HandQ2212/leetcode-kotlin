class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var result = MutableList(candies.size) { false }
        var maxx = candies.get(0)
        for (i in 1 until candies.size) {
            if (candies[i] > maxx)   maxx = candies.get(i)
        }
        for (i in 0 until candies.size) {
            if (candies.get(i) + extraCandies >= maxx) {
                result.set(i, true)
            }
        }
        return result
    }
}