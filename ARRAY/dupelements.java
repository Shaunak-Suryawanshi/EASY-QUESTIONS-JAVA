import java.util.HashMap;
public class dupelements {
    
    public static void main(String[] args) {
        
        int arr []={10,20,30,10,40,50,20,30};

        HashMap<Integer, Integer> elementCount = new HashMap<>();

        for(int num : arr){
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        for(int key : elementCount.keySet()){
            if(elementCount.get(key) > 1){
                System.out.println("Element: " + key + ", Count: " + elementCount.get(key));
            }
        }


    }
}
