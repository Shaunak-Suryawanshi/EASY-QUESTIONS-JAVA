public class smallest {

    public static void main(String[] args) {
        
        int arr[] ={12,34,56,78,90,11,23};

        int smallest = arr[0];

        for(int x : arr){

            if(x < smallest){

                smallest = x;
                System.out.println("Smallest so far: " + smallest);
            }
        }
    }
    
}
