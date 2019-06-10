 public List<Integer> findAnagrams(String s, String p) {
        // write your code here
        
        List<Integer> indices = new ArrayList();
        if (s.equals("") || p.equals("") || p.length() > s.length()) return indices;

        int[] hash_p = new int[26];
        int[] h = new int[26];
        for (int i = 0; i < p.length(); i++)
        {
            hash_p[p.charAt(i) - 'a']++;
            h[s.charAt(i) - 'a']++;
        }
        boolean iguales = true;
        for (int i = 0; i + p.length() < s.length(); i++)
        {
              iguales = true;
            for (int k = 0; k < 26; k++)
            {
                if (hash_p[k] != h[k]) iguales = false;
            }
            if (iguales) indices.add(i);

            h[s.charAt(i) - 'a']--;
             h[s.charAt(i + p.length()) - 'a']++;
        }
        iguales = true;
        for (int k = 0; k < 26; k++)
        {
            if (hash_p[k] != h[k]) iguales = false;
        }
        if (iguales) indices.add(s.length() - p.length());
        return indices;
        
    }