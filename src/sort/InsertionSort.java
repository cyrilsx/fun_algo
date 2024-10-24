package sort;

class InsertionSort {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sorted = new ListNode(head.val); // -1
        head = head.next;  // 0
        while (head != null) {
            ListNode current = sorted; // 1e ite current - 1
            ListNode prev = null;
            while (current != null && head.val > current.val) {
                prev = current;
                current = current.next;
            }
            if (prev == null) {
                sorted = new ListNode(head.val, sorted);
            } else {
                prev.next = new ListNode(head.val, current);
            }

            head = head.next;
        }
        return sorted;
    }


    public static void main(String[] args) {
        //ListNode test1 = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNode test1 = new ListNode(-1, new ListNode(0, new ListNode(1, new ListNode(3))));
        ListNode listNode = new InsertionSort().insertionSortList(
                test1
        );

        while (listNode != null) {
            System.out.print(listNode);
            listNode = listNode.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return " " + val;
        }
    }

}