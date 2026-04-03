class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.length == 0) return true
        if (t.length == 0) return false
        return haveSub(s, t, 0, 0)
    }

    fun haveSub(s: String, t: String, sIndex: Int, tIndex: Int): Boolean {
        if (tIndex == t.length || sIndex == s.length) return false
        if (s[sIndex] == t[tIndex]) {
            return if (sIndex == s.length-1) true else haveSub(s, t, sIndex+1, tIndex+1)
        } 
        return haveSub(s, t, sIndex, tIndex+1)
    }
}