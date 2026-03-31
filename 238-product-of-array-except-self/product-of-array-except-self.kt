class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var multi = 1
        var countZero = 0
        nums.forEach { num ->
            if (num != 0) multi *= num
            else {
                countZero++
            }
        }
        if (countZero > 0) {
            if (countZero == 1) {
                nums.forEachIndexed { index, i ->
                    if (nums[index] == 0) nums[index] = multi
                    else nums[index] = 0
                }
            } else {
                nums.forEachIndexed { index, i ->
                    nums[index] = 0
                }
            }
        } else {
            nums.forEachIndexed { index, i ->
                nums[index] = multi/nums[index]
            }
        }
        return nums
    }
}