
import java.util.List;

public class insert {
    
    public static void main(String[] args) {
        
        // int [] arr ={3, 5, 7, 2, 8, -2, 4, 10, 12};
        // int insertValue = 6; // Value to be inserted
        // int insertIndex = 4; // Index at which the value is to be inserted

        // int [] newArr = new int[arr.length + 1];

        // for(int i = 0, j = 0; i < newArr.length; i++) {
        //     if(i == insertIndex) {
        //         newArr[i] = insertValue;
        //     } else {
        //         newArr[i] = arr[j++];
        //     }
        // }

        // for(int i : newArr) {
        //     System.out.print(i + " ");
        // }

        List<Integer> list = new java.util.ArrayList<>();

        for (int i = 0; i < 6; i++) {
    list.add(0); // dummy values
}
        list.add(6, 12);

        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}
