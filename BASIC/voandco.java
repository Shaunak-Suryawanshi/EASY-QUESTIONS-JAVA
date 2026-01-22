

public class voandco {

    public static void main(String[] args) {
        
        String s ="Hello";

        int vowels = (int) s.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
        int consonants = (int) s.chars().filter(c -> "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1).count();

        System.out.println("Vowels: " + vowels);    

        System.out.println("Consonants: " + consonants);
    }
    
}
