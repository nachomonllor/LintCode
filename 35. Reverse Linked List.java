public static ListNode reverse(ListNode head) {
        // write your code here
        ListNode prev = null; 
        ListNode actual = head; 
        ListNode proximo = null; 
        while (actual != null) { 
            proximo = actual.next; 
            actual.next = prev; 
            prev = actual; 
            actual = proximo; 
        } 
        head = prev; 
        return head;
        
    }