/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val answer = ListNode(0)
        var running_node = answer
        var save = 0

        var l1Current = l1
        var l2Current = l2

        while (l1Current != null || l2Current != null || save != 0) {
            val value_1 = l1Current?.`val` ?: 0
            val value_2 = l2Current?.`val` ?: 0

            val sum = value_1 + value_2 + save
            save = sum/10
            running_node.next = ListNode(sum % 10)
            running_node = running_node.next!!

            l1Current = l1Current?.next
            l2Current = l2Current?.next
        }

        return answer.next
    }
}