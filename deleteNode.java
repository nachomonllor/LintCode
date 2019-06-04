public ListNode deleteNode(ListNode head, int n, int m) {
        // Write your code here
        
         ListNode ans = new ListNode(head.val);
        int i =0;
        for(ListNode nodo = head; nodo != null; nodo = nodo.next) {
            if(i>=n && i <= m) {
                ans.next = null;
                //head = head.next;
            }
            else{
                ans.next = nodo;
            }
            i++;
        }
        
        return ans;
        
    }
