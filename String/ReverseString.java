public class ReverseString {
    public static void main(String[] args){
        String str = "hello";
        String reverse = "";
        
        for(int i = str.length() - 1; i>=0;i--){
            reverse += str.charAt(i);
        }       
        System.out.println(str);
        System.out.println(reverse);     
    }  
}


/*
hello
olleh
*/