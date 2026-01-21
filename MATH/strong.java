

public class strong {

    public static void main(String[] args) {
        int number = 123;
        if (isStrong(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }

    public static boolean isStrong(int number) {
        
        
        int sum = 0;
        int temp = number;

        while(temp > 0){

            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
}
