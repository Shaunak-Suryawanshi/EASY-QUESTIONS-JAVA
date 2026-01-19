

public class anagram {

    public static void main(String[] args) {

        String s1="listen";
        String s2="silent";


        if(s1.length() != s2.length()){
            System.out.println("Not anagram");
            return;
        }


        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        if(java.util.Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");  
        }

    }
    
}
