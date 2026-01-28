public class findsubstring {
    
    public static void main(String[] args) {
        
        String str = "Hello World";
        String sub = "World";

        int index = str.indexOf(sub);

        if(index !=-1){
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found");
        }


    }
}
