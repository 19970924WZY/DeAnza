/*
 * @Zhengyu Wu
 * CIS36A TTh 11:30am - 01:20pm
 * Assignment
 * No partner.
 */

public class ArrayMethods {

    /**
     * prints the contents of an array to the console using a for loop
     * @param data the array to print
     */
    public static void printArray(int[] data) {
    	for(int i = 0; i < data.length; i++) {
    		System.out.println(data[i]);
    	}
    	return;
    }

    
    /**
    * Given an array of ints, return true if 10 appears as
    * either the first or last element in the array. The array will be size 1 or more.
    * first10Last([1, 2, 10]) → true
    * first10Last([10, 1, 2, 3]) → true
    * first10Last([13, 10, 1, 2, 3]) → false
    * @param data the array of integer values
    * @return whether or not 10 appears as the first or last element
    */
    public static boolean first10Last(int data[]) {
    	if(data.length >= 1) {
    		if(data[0] == 10 || data[data.length - 1] == 10) {
    			return true;
    		}
    	}
        return false;
    }
    
    /**
    * Given an array of ints, return true if the array is size 1 or more,
    * AND the first element and the last element are equal.
    * equalFirstLast([1, 2, 3]) → false
    * equalFirstLast([1, 2, 3, 1]) → true
    * equalFirstLast([1, 2, 1]) → true 
    * @param array the array of integers
    * @return whether the first and last element are identical
    */
    public static boolean equalFirstLast(int[] array){
    	if(array.length >= 1) {
    		if(array[0] == array[array.length -1]) {
    			return true;
    		}
    	}
        return false;
    }
    
    /**
    * Given an array of ints, add 2 to each element in the array
    * return nothing.
    * arrayPlus2([1,2,3]) -> [3, 4, 5]
    * arrayPlus2([10, 30, 50, 79, 85]) -> [12, 32, 52, 81, 87]
    * arrayPlus2([5]) -> [7]
    * @param array the array of integer values
    */
    public static void arrayPlus2(int array[]) {
    	for(int j = 0; j < array.length; j++) {
    		array[j] += 2;
    	}
        return;
    }
    
    /**
     * Given an array of ints, multiplies each element in the array by itself
     * squareArray([1,2,3]) -> [1, 4, 9]
     * squareArray([3, 5, 6, 8, 9]) -> [9, 25, 36, 64, 81]
     * squareArray([5]) -> [25]
     * @param array the array of integer values
     */
    public static void squareArray(int[] array){
    	for(int k = 0; k < array.length; k++) {
    		array[k] *= array[k];
    	}
        return;
    }
    

    public static void main(String[] args)
    {
      
        boolean answer;
      
        System.out.println("***Testing first10Last***\n");
        int array1[] = {1, 2, 10};
        answer = first10Last(array1);
        System.out.println("Should print true: " + answer);
        int array2[] = {10, 1, 2, 3};
        answer = first10Last(array2);
        System.out.println("Should print true: " + answer);
        int array3[] = {13, 10, 1, 2, 3};
        answer = first10Last(array3);
        System.out.println("Should print false: " + answer);
        System.out.println();

        System.out.println("***Testing equalFirstLast***\n");
        int array4[] = {1, 2, 3};
        answer = equalFirstLast(array4);
        System.out.println("Should print false: " + answer);
        int array5[] = {10, 20, 50, 60, 80, 90, 10};
        answer = equalFirstLast(array5);
        System.out.println("Should print true: " + answer);
        int array6[] = {1};
        answer = equalFirstLast(array6);
        System.out.println("Should print true: " + answer);
        System.out.println();

        System.out.println("***Testing arrayPlus2***\n");
        int array7[] = {1, 2, 3};
        arrayPlus2(array7);
        System.out.println("Should print 3 4 5: ");
        printArray(array7);
        System.out.println();
        int array8[] = {10, 30, 50, 79, 85};
        arrayPlus2(array8);
        System.out.println("Should print 12 32 52 81 87: ");
        printArray(array8);
        System.out.println();
        int array9[] = {5};
        arrayPlus2(array9);
        System.out.println("Should print 7: ");
        printArray(array9);
        System.out.println("\n");

        System.out.println("***squareArray***\n");
        int array10[] = {1, 2, 3};
        squareArray(array10);
        System.out.println("Should print 1 4 9: ");
        printArray(array10);
        System.out.println();
        int array11[] = {3, 5, 6, 8, 9};
        squareArray(array11);
        System.out.println("Should print 9 25 36 64 81: ");
        printArray(array11);
        System.out.println();
        int array12[] = {5};
        squareArray(array12);
        System.out.println("Should print 25: ");
        printArray(array12);
        System.out.println("\n");

        System.out.println("***End of Tests***");
       


    }

}