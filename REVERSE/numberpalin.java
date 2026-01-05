public class numberpalin{

    public static void main(String[] args) {
        

        int num = 121;

        int rev =0 ;

        int temp = num;

        while(temp>0){

            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp/=10;
        }

        System.out.println(rev == num ? "Palindrome Number" : "Not a Palindrome Number");


    }
}