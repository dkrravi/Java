/*
Linear Search (also called Sequential Search) is the simplest searching algorithm. It checks every element in the array sequentially until it finds the target element or reaches the end.

Start from the first element.
Compare the target with each element.
If a match is found, return the index.
If no match is found till the end, return -1. 

*/

public class LinearSearch {
    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[]args){
        int[] numbers = {12,13,14,15,16};
        int target  = 13;
        int result = linearSearch(numbers,  target);
        
        if(result == -1){
            System.out.println("Item not found");       
        }else{
            System.out.println("Item found:  " +result); 
        }
    }
}

// Item found:  1