 public static void  rotateString(char[] str, int offset)
    { 
        
        if(str.length ==0)return;
        
        // write your code here
        offset = offset % str.length;
        
       if(offset > str.length ) {
            return;
        }
        
        //usando string auxiliar
        String s = new String(str);
        String x = s.substring(s.length() - offset)
            + s.substring(0, s.length() - offset);
        char[] ch = x.toCharArray();
        System.arraycopy(ch, 0, str, 0, str.length);

    }
    