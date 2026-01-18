
import java.util.Arrays;
public class secondlargest {
    
    public static void main(String args[]){

        int arr []={12,34,56,78,90,11,23};

       Arrays.sort(arr);

        System.out.println("Second largest element is: " + arr[arr.length - 2]);
    }
}
