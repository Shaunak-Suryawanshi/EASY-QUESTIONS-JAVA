
import java.util.HashSet;

public class panagram {
    
    public static void main(String[] args) {
        
        String str = "The quick brown fox jumps over a lazy dog";

        
        HashSet<Character> charSet = new HashSet<>();

        for(char c : str.toLowerCase().toCharArray()){
            if(c >= 'a' && c <= 'z'){
                charSet.add(c);
            }
        }

        System.out.println(charSet.size() ==26 ? "The string is a pangram." : "The string is not a pangram.");
    }
}
