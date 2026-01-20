public class special {

    public static void main(String[] args) {
        
        String str = "Hello@World#2024!";

        str= str.replaceAll("[^a-zA-Z0-9]", " ");
        
        System.out.println(str);
    }
    
}
