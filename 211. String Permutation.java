public boolean Permutation(String A, String B) {
        // write your code here
         
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        return new String(a).equals(new String(b));
    }