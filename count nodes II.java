public int countNodesII(ListNode head) {
        // 
        int cont = 0;
        for(ListNode nodo = head; nodo != null; nodo = nodo.next) {
            if(nodo.val > 0 && nodo.val % 2 != 0) {
                cont++;
            }
        }
        return cont;
    }