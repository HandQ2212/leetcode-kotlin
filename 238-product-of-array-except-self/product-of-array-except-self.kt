class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)

        var multiRight = 1
        for (i in nums.size-1 downTo 0) {
            result[i] = multiRight
            multiRight *= nums[i]
        }

        var multiLeft = 1
        for (i in nums.indices) {
            result[i] *= multiLeft
            multiLeft *= nums[i]
        }
        
        return result
    }
}