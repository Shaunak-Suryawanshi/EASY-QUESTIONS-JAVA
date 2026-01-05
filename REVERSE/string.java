
import java.util.Scanner;


public class string{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char [] arr = s.toCharArray();

        int left =0; // TWO POINTERS DSA APPROACH
        int right = arr.length -1;

        while(left < right){

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));
    }
}