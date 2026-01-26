public class countevenodd {

    public static void main(String[] args) {
        
        int [] arr = {12, 3, 5, 7, 8, 10, 15, 18, 20};

        int even =0 ;
        int odd =0 ;

        for(int i=0 ; i< arr.length ; i++){

            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        
        
        }
        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
    }
    
}
