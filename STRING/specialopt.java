public class specialopt {

    public static void main(String[] args) {
        
        String str = "Hello@World#2024!";

        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(ch);
            } else {
                cleaned.append(' ');
            }
        }

        System.out.println(cleaned.toString());

      


        
        
    }
    
}
