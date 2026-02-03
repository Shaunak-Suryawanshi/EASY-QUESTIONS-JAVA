public class swapwithoutthird {
    
    public static void main(String[] args) {
        
        int a = 10 ;
        int b = 20;

        a = a + b ;
        b = a - b ;
        a = a - b ;

        System.out.println("A is "+a + "B is "+b);
    }
}
