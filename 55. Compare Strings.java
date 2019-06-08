public static boolean compareStrings(String A, String B) {
        // write your code here
        HashMap<Character, Integer> hma =
                new HashMap();
        for(int i =0; i<A.length(); i++) {
            if(hma.containsKey(A.charAt(i))) {
                hma.put(A.charAt(i), hma.get(A.charAt(i))+1);
            } else {
                hma.put(A.charAt(i), 1);
            }
        }
       
        HashMap<Character, Integer> hmb =
                new HashMap();
        for(int i =0; i<B.length(); i++) {
            if(hmb.containsKey(B.charAt(i))) {
                hmb.put(B.charAt(i), hmb.get(B.charAt(i))+1);
            } else {
                hmb.put(B.charAt(i), 1);
            }
        }
       
        for(char key : hmb.keySet()) {
            if(!hma.containsKey(key)) return false;
            else {
                if(hma.get(key) < hmb.get(key)) {
                    return false;
                }
            }
        }
       
        return true;
       
    }
