public class iterative {

    public static int gcd(int a , int b){

        while(b!=0){

            int rem = a % b;
            a=b;
            b=rem;
        }

        return a;
    }

    public static int lcm(int a , int b){

        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {
        
        int a = 48;
        int b = 18;

        int result = lcm(a,b);

        System.out.println("LCM of " + a + " and " + b + " is: " + result);
    
}
}