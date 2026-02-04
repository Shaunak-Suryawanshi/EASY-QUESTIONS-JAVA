public class removezeros {

    public static void main(String[] args) {
        
        int [] arr ={0,1,0,3,0,5,6};

        int count = 0;

        for(int num : arr){
            if(num !=0){
                count ++;
            }
        }

        int [] result = new int[count];

        int index = 0;

        for(int num : arr){
            if(num !=0){
                result[index++] = num;
            }
        }

        for(int num : result){
            System.out.println(num);
        }

    }
    
}
