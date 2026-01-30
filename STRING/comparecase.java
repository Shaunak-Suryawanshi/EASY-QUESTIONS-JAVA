public class comparecase {
    
    public static void main(String[] args) {
        
        String str1 = "Hello World";
        String str2 = "hello world";

        
        if(str1.equals(str2)){
            System.out.println("The strings are equal (case-sensitive).");
        } else {
            System.out.println("The strings are not equal (case-sensitive).");
        }
    }
}
