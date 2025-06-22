public class WordCount {
    public static void main(String[] args){
        String str = "Hello World";
        String[] words = str.trim().split("\\s+");
        System.out.println("No.of words: " +words.length);
    }
}

// No.of words: 2