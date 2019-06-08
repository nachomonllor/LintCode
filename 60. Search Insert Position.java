public static int searchInsert(int[] A, int target) {
        // write your code here
        
       List<Integer> lista = new ArrayList();
       //for(int i )
       for(int i =0; i<A.length; i++) {
           lista.add(A[i]);
       }
       lista.add(target);
       Collections.sort(lista);
       
       return lista.indexOf(target);
       
    }
