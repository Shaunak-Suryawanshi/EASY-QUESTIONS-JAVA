public class automorphic {
    
    public static void main(String[] args) {
        
        int num = 25;
        int square = num * num;

        if(String.valueOf(square).endsWith(String.valueOf(num))){
            System.out.println("AUTOMORPHIC");
        }
        else{
            System.out.println("NOT");

        }
    }
}
