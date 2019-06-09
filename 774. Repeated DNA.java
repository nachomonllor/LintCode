 public List<String> findRepeatedDna(String s) {
        // write your code here
        
         HashMap<String, Integer> hash =
                new HashMap ();

            for (int i = 0; i + 10 <= s.length(); i++)
            {
                String x = s.substring(i,i+ 10);
                if (hash.containsKey(x)) {
                    //hash[x]++;
                    hash.put(x, hash.get(x) + 1);
                }
                 
                else {
                    //hash[x] = 1;
                    hash.put(x, 1);
                }
            }

            List<String> ans = new ArrayList ();

            hash.keySet().stream().filter((item) -> (hash.get(item) > 1 )).forEach((item) -> {
                ans.add(item);
            });

            return ans;
        
    }