package sort;

class InsertionSort {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sorted = new ListNode(head.val);
        head = head.next;
        while(head != null) {
            ListNode current = sorted;
            while (head.val > current.val  && current.next != null) {
                current = current.next;
            }
            if (current == sorted) {
                sorted = new ListNode(head.val, sorted);
            } else {
                int temp = current.val;
                current.val = head.val;
                head.val = temp;
                current.next = head;
            }
            head = head.next;
        }
        return sorted;
    }



    public static void main(String[] args) {
        ListNode listNode = new InsertionSort().insertionSortList(
                new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))))
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