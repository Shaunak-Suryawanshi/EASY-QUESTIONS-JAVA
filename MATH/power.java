

public class power {

    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = power(base , exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static int power(int base , int exponent){

      int result = 1;
      for(int i=0 ; i<exponent ; i++){
        result = result * base;
      }
    return result;
  }
}