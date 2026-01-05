
import java.util.Scanner;


public class inplace{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s;

        s= sc.nextLine();

        char [] arr = s.toCharArray();
        int j=0;

        for(int i=0 ; i<s.length() ; i++){

            if(arr[i]!= ' '){

                arr[j++]=arr[i];

            }
        }

        String result = new String(arr , 0 , j);
        System.out.println(result);
    }
}