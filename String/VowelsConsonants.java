public class VowelsConsonants {
    public static void main(String[]args){
        String str = "race";
        int vowels = 0, consonants = 0;
        
        str.toLowerCase();
        
        
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch <= 'z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        
        System.out.println(vowels);
        System.out.println(consonants);
    }
}


/*
2
2
*/