
import java.util.*;



public class numbercollection{

    public static void main(String[] args) {
        
        
        int num = 123;

        Deque<Integer> dq= new ArrayDeque<Integer>();

        while(num >0){

            dq.addLast(num %10);
            num/=10;
        }

        int rev =0;

        while(!dq.isEmpty()){

            rev = rev *10 + dq.removeFirst();
        }

        System.out.println("Reversed Number is :"+ rev);


    }
}
