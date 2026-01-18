public class secondlop {

    public static void main(String[] args) {
        
        int arr[] = {12,34,56,78,90,11,23};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int x : arr){

            if ( x > largest){

                secondLargest = largest;
                largest = x;
            }
            else if ( x > secondLargest && x != largest){

                secondLargest = x;
            }
        }
        System.out.println("Second largest element is: " + secondLargest);
    }
}
