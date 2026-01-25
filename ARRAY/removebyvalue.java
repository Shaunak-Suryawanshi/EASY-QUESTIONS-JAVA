public class removebyvalue {
    
    public static void main(String[] args) {
        
        int [] arr ={3, 5, 7, 2, 8, -2, 4, 10, 12};
        int removeValue = 2; // Value of the element to be removed

        int count = 0;

        for(int i : arr) {
            if(i != removeValue) {
                count++;
            }
        }

        int [] newArr = new int[count];

        for(int i = 0, j = 0; i < arr.length; i++) {
            if(arr[i] != removeValue) {
                newArr[j++] = arr[i];
            }
        }

        for(int i : newArr) {
            System.out.print(i + " ");
        }



    }
}
