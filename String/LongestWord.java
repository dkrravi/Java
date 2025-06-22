public class LOngestWord {
    public static void main(String[] args){
        String str  = "Placement Preparation test successful";
        String[] words = str.split(" ");
        String longest = " ";
        
        for(int i=0; i< words.length;i++){
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }
        System.out.println(str);
        System.out.println(longest);
        
    }
}

/*
Placement Preparation test successful
Preparation
*/