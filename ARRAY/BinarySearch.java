public class BinarySearch {

    public static void main(String[] args) {
        
        int arr[] ={10,20,30,40,50};

        int key = 30;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == key){
                System.out.println("Element found at index: " + mid);
                return;
            }
           else if (key > arr[mid]){
                left = mid + 1;
            }
           else{
                right = mid - 1;
           }
        }
        System.out.println("Element not found in the array");
    }
    
}
