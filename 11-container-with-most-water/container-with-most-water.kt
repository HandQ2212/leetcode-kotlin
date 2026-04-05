
class Solution {
    fun maxArea(height: IntArray) : Int {
        var i = 0
        var j = height.size - 1
        var maxx = 0
        while (i < j) {
            if (height[i] <= height[j]) {
                maxx = max(maxx, (j-i) * height[i])
                i++
            } else {
                maxx = max(maxx, (j-i) * height[j])
                j--
            }
        }
        return maxx
    }
}