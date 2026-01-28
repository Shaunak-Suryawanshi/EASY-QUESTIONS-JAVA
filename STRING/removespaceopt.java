public class removespaceopt {

    public static void main(String[] args) {
        
        String str = " Hello World ";

        StringBuilder result = new StringBuilder();

        for(int i=0 ; i<str.length(); i++) {
            if(str.charAt(i)!=' '){
                result.append(str.charAt(i));
            }
            }
        System.out.println(result.toString());
        }
    }
    

