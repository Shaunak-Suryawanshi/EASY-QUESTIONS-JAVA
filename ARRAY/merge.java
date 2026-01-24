public class merge {

    public static void main(String[] args) {
        
        int []arr1 ={1,3,5,7,9};
        int []arr2 ={2,4,6,8,10};

        int index =0;

        int [] merged = new int[arr1.length + arr2.length];

        for(int i=0 ; i< arr1.length; i++){
            merged[index++] = arr1[i];
        }

        for(int i= 0 ; i < arr2.length ; i++){
            merged[index++] = arr2[i];
        }

        for(int i=0 ; i< merged.length; i++){
            System.out.print(merged[i] + " ");
        }
    }
    
}
