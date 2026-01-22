
public class alphabet {

    public static void main(String[] args) {
        
        char ch = 'A';

        if((ch >= 'A' && ch <='Z') || (ch >='a' && ch <= 'z')){

            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
    
}
