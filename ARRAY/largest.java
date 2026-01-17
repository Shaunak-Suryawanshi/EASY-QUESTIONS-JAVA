

public class largest {

    public static void main(String[] args) {
        
        int arr[]={12,34,56,78,90,11,23};

        int largest = arr[0];

        for(int x : arr){

            if(x > largest){

                largest = x;
                System.out.println("Largest so far: " + largest);
            }
           
        }
         System.out.println("Largest so far: " + largest);
    }
    
}
