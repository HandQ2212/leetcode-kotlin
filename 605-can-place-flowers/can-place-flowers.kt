class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count: Int = 0
        for (i in 0 until flowerbed.size) {
            if (flowerbed[i] == 0) {
                if (i > 0 && flowerbed[i-1] != 0) {
                    continue
                }
                if (i < flowerbed.size-1 && flowerbed[i+1] != 0) {
                    continue
                }
                count++
                flowerbed[i] = 1
            }
        }
        return count >= n
    }
}