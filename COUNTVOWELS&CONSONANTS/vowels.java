public class vowels {

    public static void main(String[] args) {
        
        
    int count = 0 ;

    String s= "Hello";


    s = s.toLowerCase();

    for(int i = 0 ; i<s.length(); i++){

        char ch = s.charAt(i);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

            count++;

        }
    }

    System.out.println("Number of vowels: " + count);

}
}