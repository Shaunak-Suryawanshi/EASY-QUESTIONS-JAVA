public class removespace1 {
    
    public static void main(String[] args) {
        
        String str = " Hello World ";

        String result = str.replaceAll("\\s", "");

        System.out.println(result);
    }
}
