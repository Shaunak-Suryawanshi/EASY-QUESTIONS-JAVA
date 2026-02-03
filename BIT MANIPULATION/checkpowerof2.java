
public class checkpowerof2 {

    public static void main(String[] args) {
        
        int n = 18;

        if(n>0 && (n & (n - 1))==0){
            System.out.println("Power of two");
        }
        else{
            System.out.println("NOT");
        }

    }
    
}
