public class consonants {

    public static void main(String[] args) {
        
        String s = "Hello";

        int count =(int) s.chars().filter(c->"bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ" .indexOf(c)!=-1).count();
        System.out.println(count);
    }
    
}
