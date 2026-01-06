public class prime {

public static void main(String[] args) {
    
    boolean isPrime = true;

    int number = 5;


    if(number <=1){
        isPrime = false;
    }

    for(int i =2 ; i<number ; i++){

        if(number % i ==0){

            isPrime = false;
            break;
        }
    }

    if(isPrime){
        System.out.println(number + " is a prime number.");
    }
    else{
        System.out.println(number + " is not a prime number.");
    }
}
    
}
