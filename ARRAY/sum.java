public class sum {
    
    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 40, 50};

        int sum =0;

        for (int x : arr){

            sum = sum + x;
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}
