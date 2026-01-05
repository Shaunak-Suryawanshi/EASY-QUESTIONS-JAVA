import java.util.Scanner;

public class optimal{

    public static int power(int base , int exp){

        int result =1;

        while(exp>0)
        {

            result *=base;
            exp--;
        }

        return result;
    }
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter number");
        num = sc.nextInt();

        int original = num;
        int sum=0 ;

        //counts digit

        int temp =num;
        int digits=0;

        while(temp>0){

            temp/=10;
            digits++;
        }

        //count and sum;

        temp = num;
        int digit;

        while(temp>0){

            digit = temp%10;
            sum+=power(digit, digits);
            temp/=10;
        }


        System.out.println(original == sum ? "ARMSTRONG" : "NOT");

        
        
    }
}