package javaapplication6;
 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
/**
 *
 * @author Usuario
 */
public class JavaApplication6 {
 
    /**
     * @param args the command line arguments
     */
   
    static String limpiar(String s) {
        String ans ="";
       
        int i =0;
       
        while(i < s.length()) {
            String concat ="";
            while(i < s.length() && s.charAt(i ) ==' '){
                i++;
            }
            while(i < s.length() && s.charAt(i) != ' ') {
                concat += s.charAt(i);
                i++;
            }
            ans += concat + " ";
           
        }
        return ans.trim();
    }
   
   
    public static String reverseWords(String s) {
        // write your code here
        String[] words = limpiar(s).split(" ");
        List<String> listRev = Arrays.asList(words);
        Collections.reverse(listRev);
        String[] rev = listRev.toArray(words);
 
        return String.join(" ", rev).trim();
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
       String s = "  the           sky        is         blue  ";
       System.out.println(  reverseWords(s));
    }
   
}
