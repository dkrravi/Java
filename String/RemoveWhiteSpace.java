public class RemoveWhiteSpace {
    public static void main(String[]args){
        String str = "Hello World";
        String nospace = str.replaceAll("\\s","");
        System.out.println(str);
        System.out.println(nospace);
    }
}


/*
Hello World
HelloWorld
*/