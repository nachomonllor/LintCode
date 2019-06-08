 public static String concatenetedString(String s1, String s2)
        {
            // write your code here
            HashSet<Character> a = new HashSet();
            HashSet<Character> b = new HashSet();

            for(int i =0; i<s1.length(); i++) a.add(s1.charAt(i));
            for(int i =0; i<s2.length(); i++) b.add(s2.charAt(i));
            
            
            String ans = "";
           
            
            for(int i =0; i<s1.length(); i++) {
                if(!b.contains(s1.charAt(i))) {
                    ans += s1.charAt(i);
                }
            }
            
           
            for(int i =0; i<s2.length(); i++) {
                if(!a.contains(s2.charAt(i))) {
                    ans += s2.charAt(i);
                }
            }
            

            return ans;
        }