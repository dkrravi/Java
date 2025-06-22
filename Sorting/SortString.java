// Sort a List of Strings in Alphabetical Order (A to Z)

import java.util.*;

public class SortStrings {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Dhanya","Venkatesh","Nethra","Sneha");
        Collections.sort(names);
        System.out.println("Sorted Order:  " +names);
    }
}

// Sorted Order:  [Dhanya, Nethra, Sneha, Venkatesh]