public class stringplain{

    public static void main(String[] args) {
        

        String s = "shaunak";

        StringBuilder sb = new StringBuilder();

        for(int i = s.length()-1 ; i>=0 ; i--){

            sb.append(s.charAt(i));
        }

        String reversed = sb.toString();


        System.out.println(s.equals(reversed)? "palindrome" : "Not Plaindrome");


    }
}