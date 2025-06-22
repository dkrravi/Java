public class CompareStrings {
    public static void main(String[]args){
        String str1 = "Java";
        String str2 = "Java";
        
        boolean areequal = true;
        
        if(str1.length() != str2.length()){
            areequal = false;
        }else{
            for(int i = 0;i<str1.length();i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    areequal = false;
                    break;
                }
            }
        }
        
        if(areequal){
             System.out.println("Strings are equal.");
        }else{
             System.out.println("Strings are not equal.");
        }
        
    }
}

/*
Strings are equal.
*/