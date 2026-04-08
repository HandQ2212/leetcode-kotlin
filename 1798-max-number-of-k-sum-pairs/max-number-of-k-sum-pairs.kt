class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()
        var i = 0
        var j = nums.size - 1
        var count = 0
        while (i < j && j >= 0 && i < nums.size) {
            if (nums[j] >= k) {
                j--
            } else if (nums[i] + nums[j] == k) {
                count++
                i++
                j--
            } else if (nums[i] + nums[j] < k) {
                i++
            } else if (nums[i] + nums[j] > k) {
                j--
            }
        }
        return count
    }
}