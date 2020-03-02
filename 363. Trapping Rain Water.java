  public static int trapRainWater(int[] heights) {
        // write your code here
        if(heights == null || heights.length == 0) return 0;
        int[] izq = new int[heights.length];
        izq[0] = heights[0];
        for(int i = 1; i<heights.length; i++) {
            izq[i] = Math.max(izq[i - 1], heights[i]);
        }
        int[] der = new int[heights.length];
        der[der.length-1] = heights[heights.length - 1];
        for(int i = heights.length-2; i>=0; i--) {
            der[i] = Math.max(der[i+1], heights[i] );
        }
        
        int ans =0;
        for(int i =0; i<heights.length; i++) {
            ans += Math.min(der[i], izq[i]) - heights[i];
        }
        return ans;
        
    }