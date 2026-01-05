import java.util.Scanner;
public class number{

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        int rev = 0;

        int temp = num;
        while(temp>0){

            int digit = temp %10;
            rev = rev *10+ digit;
            temp/=10;
        }


        System.out.println("Reversed Number is :"+ rev);
    }
}