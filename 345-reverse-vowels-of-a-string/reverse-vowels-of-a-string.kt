class Solution {
    fun reverseVowels(s: String): String {
        val chars = s.toCharArray()
        val vowels = "aeiouAEIOU"

        var left = 0
        var right = s.length - 1

        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) {
                left++
            }
            while (left < right && !vowels.contains(chars[right])) {
                right--
            }
            if (left < right) {
                val temp = chars[left]
                chars[left] = chars[right]
                chars[right] = temp
                left++
                right--
            }
        }
        return String(chars)
    }
}