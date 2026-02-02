public class countprime {
    
    public static void main(String[] args) {
        
        int n = 20;
        int count = 0;

        for(int i=2 ; i<=n ; i++){
            boolean isPrime = true;
        

        for(int j=2 ; j<=i/2 ; j++){

            if(i % j ==0){
                isPrime = false;
                break;
            } }
            if(isPrime){
                count ++;
            }
        }
    
    System.out.println(count);
}
}
