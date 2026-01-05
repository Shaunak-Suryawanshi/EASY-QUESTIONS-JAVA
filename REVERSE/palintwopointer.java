

public class palintwopointer{

    public static void main(String[] args) {
        

        String s ="madam";

        char [] arr = s. toCharArray();


        int left =0 ;
        int right = arr.length -1;

        while(left < right){

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(arr);

        System.out.println(s.equals(reversed)? "palindrome" : "Not Plaindrome");
    }
}