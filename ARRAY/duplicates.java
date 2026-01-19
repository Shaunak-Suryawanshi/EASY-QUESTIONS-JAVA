import java.util.*;
public class duplicates {
 
    public static void main(String[] args) {
        
        int arr []={10,20,30,10,40,50,20,30};

        System.out.println("The duplicate elements in the array are: ");

        LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();
        

        for(int x : arr){

            duplicates.add(x);

        }
        System.out.println(duplicates);
    }
}
