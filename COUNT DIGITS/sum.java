
public class sum {

    public static void main(String[] args) {
        

        int num = 123;

        int sum = 0 ;

        while(num > 0){

            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        // for (; n > 0; n /= 10) {
        //     sum += n % 10;
        // }

        System.out.println("Sum of digits: " + sum);
}
}