public class binarytodecimal {

    public static void main(String[] args) {
        
        int binary = 1010;
        int decimal = 0;
        int power = 1;

        while(binary > 0){
            int last = binary % 10;
            decimal = decimal + last * power;
            power = power *2;
            binary = binary / 10;
        }
        System.out.println(decimal);
    }
    
}
