public class dupopt {
    
    public static void main(String[] args) {

        //works only for sorted array
        
        int arr[]= {10,20,30,10,40,50,20,30};

        int j=0;

        for(int i =0 ; i< arr.length-1 ; i++)
            {

            if(arr[i] != arr[i+1])
                {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[arr.length -1];

        for(int i=0 ; i<j ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
