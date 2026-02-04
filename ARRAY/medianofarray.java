import java.util.Arrays;

public class medianofarray {
    
    public static void main(String[] args) {
        
        int [] arr ={5,2,1,4,3};

        Arrays.sort(arr);

        int n = arr.length;

        if(n % 2 !=0){
            System.out.println("Median" + arr[n /2]);
        }
        else{
            System.out.println("Median = " + (arr[n/2 - 1] + arr[n/2]) / 2.0);
        }

        
    }
}
