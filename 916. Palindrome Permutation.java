 public boolean canPermutePalindrome(String s)
        {
            // write your code here
            HashMap<Character, Integer> hash =
                new HashMap();

            for (int i = 0; i < s.length(); i++)
            {
                //if (hash.ContainsKey(s[i])) hash[s[i]]++;
                //else hash[s[i]] = 1;
                if(hash.containsKey(s.charAt(i)) ) {
                    hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
                }
                else{
                    hash.put(s.charAt(i), 1);
                }
            }

            int impares = 0;

           for (Character key : hash.keySet()) {
               if(hash.get(key) % 2 != 0) impares++;
           }

            return impares < 2;

        }