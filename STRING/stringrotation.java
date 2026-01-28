public class stringrotation {
    
    public static void main(String[] args) {
        
        String str1 = "ABCD";
        String str2 = "CDAB";

        if(str1.length() == str2.length() && (str1+ str2).indexOf(str2)!=-1){
            System.out.println("String is rotation of another string");
        } else {
            System.out.println("String is not rotation of another string");
        }
    }
}
