
public class ascii {

    public static void main(String[] args) {
        char character = 'A';
        int asciiValue = getAsciiValue(character);
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
    }

    public static int getAsciiValue(char character) {
        return (int) character;
    }
    
}
