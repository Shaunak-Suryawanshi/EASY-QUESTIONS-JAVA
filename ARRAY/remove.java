public class remove {

    public static void main(String[] args) {
        
        int [] arr ={3, 5, 7, 2, 8, -2, 4, 10, 12};

        int removeIndex = 3; // Index of the element to be removed

        int [] newArr = new int[arr.length - 1];

        for(int i = 0, j = 0; i < arr.length; i++) {
            if(i != removeIndex) {
                newArr[j++] = arr[i];
            }
        }

        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    
}
