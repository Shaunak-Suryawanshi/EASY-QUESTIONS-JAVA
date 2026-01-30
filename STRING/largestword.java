public class largestword {
    
    public static void main(String[] args) {
        
        String str="Find the largest word in this sentence";

        String words[] = str.split(" ");

        String largest = words[0];

        for(String word : words){

            if(word.length() > largest.length()){
                largest = word;
            }
        }

        System.out.println("The largest word is: " + largest);
    }
}
