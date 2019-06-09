 public static  List<String> anagrams(String[] strs)
    {
         // write your code here
         HashMap<String, Integer> hash =
             new HashMap<String, Integer>();
         for (int i = 0; i < strs.length; i++)
         {
             char[] ord = strs[i].toCharArray();
             Arrays.sort(ord);
             //hash.Add(new string(ord));
             String s = new String(ord);
             if (hash.containsKey(s))
             {
                 //hash[new String( ord)]++;
                 hash.put(s, hash.get(s) + 1);
             }
             else
             {
                 //hash[new string( ord)] = 1;
                 hash.put(s, 1);
             }
         }

         List<String> ans = new ArrayList<String>();
         for (int i = 0; i < strs.length; i++)
         {
             char[] ord = strs[i].toCharArray();
             Arrays.sort(ord);
             String s = new String(ord);
             if (hash.get(s) > 1)
             {
                 ans.add(strs[i]);
             }
         }

         return ans;
     }