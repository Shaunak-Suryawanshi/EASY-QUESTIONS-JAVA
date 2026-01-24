
import java.util.HashMap;

public class frequency {

    public static void main(String[] args) {
        
        int [] arr ={1,2,3,4,2,3,4,5,6,4,3,2,1,4,5,6,7,8,4,3,2,1};

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
         }

         for(int key : freqMap.keySet()){
            System.out.println("Element: " + key + ", Frequency: " + freqMap.get(key));
         }
    }
    
}
