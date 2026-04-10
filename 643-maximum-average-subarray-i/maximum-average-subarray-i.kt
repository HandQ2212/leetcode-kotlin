class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = 0
        for (i in 0 until k) {
            sum += nums[i]
        }

        var maxSum = sum
        for (i in k until nums.size) {
            sum = (sum - nums[i-k]) + nums[i]
            maxSum = max(maxSum, sum)
        }

        return 1.0*maxSum / k
    }
}