   public boolean anagram(String s, String t) {
        // write your code here
        
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        return new String(a).equals(new String(b));
        
    }