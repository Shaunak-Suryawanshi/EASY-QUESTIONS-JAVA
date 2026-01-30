public class togglecase {
    
    public static void main(String[] args) {
        
        String str = "hElLo WoRLd";

        StringBuilder toggledStr = new StringBuilder();

        for(char c : str.toCharArray()){

            if(Character.isUpperCase(c)){
                toggledStr.append(Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)){
                toggledStr.append(Character.toUpperCase(c));
            } else {
                toggledStr.append(c);
            }
        }
        System.out.println(toggledStr.toString());
    }
}
