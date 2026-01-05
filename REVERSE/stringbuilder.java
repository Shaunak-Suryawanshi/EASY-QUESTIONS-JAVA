public class stringbuilder{

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();

        String str = "Hello";

        for(int i=str.length()-1 ; i>=0 ; i--){

            sb.append(str.charAt(i));


        }

        System.out.println(sb.toString());
    }
}