    public static List<String> fizzBuzz(int n) {
        // write your code here
        List<String> ans = new ArrayList();
        for(int i =1; i<=n; i++) {
            if(i%3 ==0 && i %5 ==0){
                ans.add("fizz buzz");
            } else if(i % 3 ==0) {
                ans.add("fizz");
            } else if(i % 5 ==0) {
                ans.add("buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
