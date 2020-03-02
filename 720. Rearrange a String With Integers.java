public static String rearrange(String str) {
        // Write your code here
        if(str.length() == 0) return "";
        String x = "";
        List<Character> c = new ArrayList();
        int sum =0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt( i) <= 9) {
                sum += (str.charAt(i) - '0');
            }
            else
            {
                c.add(str.charAt(i));
            }
        }
        
        Collections.sort(c);
        
        String ans = "";
        for(int i =0; i<c.size(); i++) {
            ans += c.get(i);
        }
        return ans + String.valueOf(sum);
    }
    