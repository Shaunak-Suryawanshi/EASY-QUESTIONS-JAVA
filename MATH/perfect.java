
public class perfect {

    public static void main(String[] args) {
        int number = 28;
        if (isPerfect(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    public static boolean isPerfect(int number){

        int sum =0;
        for(int i=1 ; i<=number/2 ; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        return sum == number ;
    }


    
}
