class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val result = StringBuilder()
        var i1 = 0
        var i2 = 0
        while (i1 < word1.length && i2 < word2.length) {
            result.append(word1[i1++])
                .append(word2[i2++])
        }
        if (word1.length < word2.length) {
            result.append(word2.substring(i2))
        }
        if (word1.length > word2.length) {
            result.append(word1.substring(i1))
        }
        return result.toString()
    }
}