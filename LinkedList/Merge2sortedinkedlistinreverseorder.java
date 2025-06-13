Merge 2 sorted linked list in reverse order
Difficulty: MediumAccuracy: 62.29%Submissions: 62K+Points: 4
Given two linked lists, which are sorted in non-decreasing order. The task is to merge them in such a way that the resulting list is in non-increasing order.

Examples:

Input: LinkedList1 = 1->3, LinkedList2 = 2->4
Output: 4->3->2->1
Explanation: After merging the two lists in non-increasing order, we have new lists as 4->3->2->1.

Input: LinkedList1 = 5->10->15->40, LinkedList2 = 2->3->20
Output: 40->20->15->10->5->3->2
Explanation: After merging the two lists in non-increasing order, we have new lists as 40->20->15->10->5->3->2.

Expected Time Complexity: O(n+m)
Expected Space Complexity: O(1)

Constraints:
1 <= size of the LinkedLists <= 105
0 <= node->data <= 106

/* Structure of the node*/
/* class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
} */

class Solution {
    Node mergeResult(Node node1, Node node2) {
        // Your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Node temp = node1;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;

        }
        temp = node2;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(arr, Collections.reverseOrder());
        Node head = new Node(-1);
        Node current = head;
        for (int i = 0; i < arr.size(); i++) {
            current.next = new Node(arr.get(i));
            current = current.next;
        }

        return head.next;
    }
}
