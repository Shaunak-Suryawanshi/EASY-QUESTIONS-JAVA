
import java.util.HashMap;

public class modeofarray {

    public static void main(String[] args) {
        
        int arr [] ={1,2,2,3,3,3,4};

        HashMap<Integer , Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num , freq.getOrDefault(num, 0)+1);
        }

        int mode = arr[0];
        int maxCount = 0;

        for(int key : freq.keySet()){
            if(freq.get(key) > maxCount){
                maxCount = freq.get(key);
                mode = key ;
            }
        }

        System.out.println(mode);
    }
    
}
