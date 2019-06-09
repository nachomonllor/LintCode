 public static boolean isIsomorphic(String s, String t)
        {
            // write your code here

            if (s.length() != t.length()) return false;

            HashMap<Character, Character> hash_a =
                    new HashMap();

            for (int i = 0; i < s.length(); i++)
            {
                if (hash_a.containsKey(s.charAt(i)))
                {
                    if (hash_a.get(s.charAt(i)) != t.charAt(i)) return false;
                   
                }
                //hash_a[s[i]] = t[i];
                hash_a.put(s.charAt(i), t.charAt(i));
            }

            HashMap<Character, Character> hash_b =
                new HashMap();

            for (int i = 0; i < t.length(); i++)
            {
                if (hash_b.containsKey(t.charAt(i)))
                {
                    //if (hash_b[t[i]] != s[i]) return false;
                    if(hash_b.get(t.charAt(i)) != s.charAt(i)) return false;
                }
                //hash_b[t[i]] = s[i];
                hash_b.put(t.charAt(i), s.charAt(i));
            }

            return true;

        }