public int singleNumberII(int[] A) {
        // write your code here
        
        HashMap<Integer, Integer> hash =
                new HashMap();
          
        for(int i = 0; i < A.length; i++) {
           if(hash.containsKey(A[i])) {
               hash.put(A[i], hash.get(A[i]) + 1);
           }
           else{
               hash.put(A[i], 1);
           }
        } 
        
         for(Integer key : hash.keySet()) {
             if( hash.get(key) != 3) {
                 return key;
             }
         }
         return -1;
        
      }
    