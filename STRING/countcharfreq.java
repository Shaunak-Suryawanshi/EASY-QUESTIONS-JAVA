import java.util.HashMap;
public class countcharfreq {
    
    public static void main(String[] args) {
        
        String str = "Hello World";

        HashMap<Character, Integer> charFrequency = new HashMap<>();

        for(char c : str.toCharArray()) {
            if(c != ' ') {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        for(char key : charFrequency.keySet()) {
            System.out.println(key + ": " + charFrequency.get(key));
        }
    }
}
