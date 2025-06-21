import java.util.Arrays;
import java.util.Collections;

public class Descending {
    public static void main(String[] args){
        Integer[] arr = {4,1,7,2,6};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Descending:  " +Arrays.toString(arr));
    }
}


// Descending:  [7, 6, 4, 2, 1]