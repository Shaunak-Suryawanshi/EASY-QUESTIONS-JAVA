
public class vowels2 {

    public static void main(String[] args) {
        
        String s = "Hello";

        int count =(int) s.chars().filter(c -> "aeiouAEIOU" .indexOf(c) != -1).count();

        System.out.println("Number of vowels: " + count);
    }
}
