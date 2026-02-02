public class nthfibonacci {
    
    public static void main(String[] args) {
        int n = 7;
        
        int a =0 , b=1 , c=0;

        if(n==0){
            System.err.println(a);
        }

        for(int i = 2 ; i<=n ; i++){
            c = a + b;
            a = b ;
            b = c;
        }

        System.err.println(b);
    }
}
