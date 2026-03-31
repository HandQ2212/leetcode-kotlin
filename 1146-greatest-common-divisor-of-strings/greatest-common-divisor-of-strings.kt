class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        if (str1 + str2 != str2 + str1) {
            return ""
        }
        val gcdLength = gcd(str1.length, str2.length)
        return str1.substring(0, gcdLength)
    }
    fun gcd(num1: Int, num2: Int): Int {
        return if (num2 == 0) num1 else gcd(num2, num1 % num2)
    }
}