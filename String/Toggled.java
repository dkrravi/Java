public class ToggleClass {
    public static void main(String[]args){
        String str = "HellO";
        StringBuilder  toggled = new  StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
               toggled.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)) {
               toggled.append(Character.toUpperCase(ch));
            }
        }
        
        System.out.println(str);
        System.out.println(toggled);
    }
}


/*
HellO
hELLo
*/