class Solution {
    fun reverseWords(s: String): String {
        val sb = StringBuilder()
        var i = s.length - 1
        while (i >= 0) {
            while (i >= 0 && s[i] == ' ') i--
            if (i < 0) break

            val end = i

            while (i >= 0 && s[i] != ' ') i--

            if (sb.isNotEmpty()) sb.append(' ')
            sb.append(s.substring(i+1, end+1))
        }
        return sb.toString()
    }
}