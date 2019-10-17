/**
 * Activity 20.3
 * @author Zhengyu Wu
 * @version CIS36A TTh 11:30am-01:20pm 03.19.2019
 */
public class ArrayMethods2 {

    /**
    * Given an array of ints, return the index of the first appearance of the
    * number 42. If not found return -1.
    * @param data array of ints
    * @return the index of the first number 42, -1 if not found.
    * Test cases:
    * findFirst42({1, 1, 42, 3, 1}) --> 2
    * findFirst42({1, 1, 2, 42, 1}) --> 3
    * findFirst42({1, 1, 2, 1, 2, 3}) --> -1
    */
    public static int findFirst42(int[] data) {
        for(int i = 0; i < data.length; i++) {
        	if(data[i] == 42) {
        		return i;
        	}
        }
    	
        return -1;
    }

    /**
     * Given an array of ints, return true if 
     * the sequence .. 1, 2, 3, .. appears
     * in the array somewhere.
     * @param data array of ints
     * @return true if .. 1, 2, 3, .. appears in the array, 
     * false otherwise.
     * Test cases:
     * is123({1, 2, 3, 1}) --> true
     * is123({1, 2, 4, 1}) --> false
     * is123({1, 2, 1, 2, 3}) --> true
     */
    public static boolean is123(int[] data) {
        for(int i = 0; i < data.length; i++) {
        	if(data[i] == 1) {
        		if(i+1 <data.length && data[i+1] == 2) {
        			if(i+2 < data.length && data[i+2] == 3) {
        				return true;
        			}
        		}
        	}
        }
        return false;
    }

    /**
     * Prints all the elements in an array to the console 
     * on one line with a space between each element.
     * @param data The array to print.
     */
    public static void printArray(int[] data) {
        for(int i = 0; i < data.length; i++) {
        	System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    /**
     * Given an array of ints, delete first appearance of the number 42.
     * By replacing it with a 0. 
     * If the number does not exist in the array, leave the array unchanged.
     * @param data array of ints
     * Hint: use return; to end the method early!
     * Test cases:
     * eraseFirst42({1, 2, 42, 3, 1}) --> {1, 2, 0, 3, 1}
     * eraseFirst42({1, 2, 3, 42, 42, 1}) --> {1, 2, 3, 0, 42, 1}
     * eraseFirst42({1, 2, 3}) --> {1, 2, 3}
     */
    public static void eraseFirst42(int[] data) {
    	for(int i = 0; i < data.length; i++) {
    		if(data[i] == 42) {
    			data[i] = 0;
    			break;
    		}
    	}
        return;
    }



    public static void main(String[] args) {
        boolean answer = false;
        int num = 0;
        
        System.out.println("***Testing findFirst42***");
        final int A3 = 3, A42 = 42;
        int[] data1 = {1, 2, A42, A3, 1};
        num = findFirst42(data1);
        System.out.println("findFirst42a should be 2: " + num);
        int[] data2 = {1, 1, 2, A42, 1};
        num = findFirst42(data2);
        System.out.println("findFirst42a should be 3: " + num);
        int[] data3 = {1, 1, 2, 1, 2};
        num = findFirst42(data3);
        System.out.println("findFirst42a should be -1: " + num);

        System.out.println("\n***Testing is123***");
        final int A4 = 4;
        int[] data4 = {1, 2, A3, 1};
        answer = is123(data4);
        System.out.println("is123a should be true: " + answer);
        int[] data5 = {1, 2, A4, 1};
        answer = is123(data5);
        System.out.println("is123a should be false: " + answer);
        int[] data6 = {1, 2, 1, 2, A3};
        answer = is123(data6);
        System.out.println("is123a should be true: " + answer);
    
        System.out.println("\n***Testing printArray***");
        System.out.println("printArray1 should be 1 2 3 1: ");
        printArray(data4);
        System.out.println("printArray2 should be 1 2 4 1: ");
        printArray(data5);
        final int A7 = 7;
        int[] data7 = {A7};
        System.out.println("printArray1 should be 7: ");
        printArray(data7);
   
        System.out.println("\n***Testing eraseFirst42***");
        eraseFirst42(data1);
        System.out.println("eraseFirst42a should be 1 2 0 3 1: ");
        printArray(data1);
        int[] data8 = {1, 2, A3, A42, A42, 1};
        eraseFirst42(data8);
        System.out.println("eraseFirst42b should be 1 2 3 0 42 1: ");
        printArray(data8);
        int[] data9 = {1, 2, A3};
        eraseFirst42(data9);
        System.out.println("eraseFirst42c should be 1 2 3: ");
        printArray(data9);
    
        System.out.print("\n***End of Tests***");

    }
}
