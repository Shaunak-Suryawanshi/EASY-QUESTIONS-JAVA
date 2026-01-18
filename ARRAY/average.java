public class average {
    
    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50};

        int sum =0;

        for(int x : arr){

            sum = sum + x;

            int average = sum / arr.length;
        }

        System.out.println("The average of the array elements is: " + (sum / arr.length));
    }
}
