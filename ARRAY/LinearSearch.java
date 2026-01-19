public class LinearSearch {

    public static void main(String[] args) {
        
        int arr []= {10, 20, 30, 40, 50};

        int key = 30;

        boolean found = false;

        for(int i=0 ; i<arr.length-1 ; i++){

            if(arr[i] == key){
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if(!found){
            System.out.println("Element not found in the array");
        }
    }
    
}
