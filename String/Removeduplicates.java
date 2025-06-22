public class Removeduplicates {
    public static void main(String[] args){
        String str = "hello";
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(result.indexOf(String.valueOf(ch)) == -1){
                result.append(ch);
            }
        }
        
        System.out.println(str);
        System.out.println(result.toString());
        
    }
}

/*
hello
helo
*/