 public static List<Integer> singleNumberIII(int[] A) {
        // write your code here
        HashMap<Integer, Integer> hash=
                new HashMap();
        
        for(int i =0; i< A.length; i++) {
            if(hash.containsKey(A[i])) 
            {
                hash.put(A[i], hash.get(A[i]) + 1);
            }
            else 
            {
                hash.put(A[i], 1);
            }
        }
        
        List<Integer> ans = new ArrayList();
        for(int key : hash.keySet()) {
            
            if(hash.get(key) != 2) {
                ans.add(key);
            }
            
        }
        Collections.sort(ans);
        return ans;
        
    }
    