
/**
 * Write a description of class MySort here.
 *
 * @author (Nick Gonzales)
 * @version (1/18/19)
 */
public class MySort
{
    public static void mySort(int array[]){
        int a = array.length; //n
        int b; //k
        for (int z = a; z >= 0; z--) {
            for (int i = 0; i < a - 1; i++) {
                b = i + 1;
                if (array[i] > array[b]) {
                    swapNums(i, b, array);
                }
            }
            printNums(array);
        }
    }
  
    private static void swapNums(int a, int b, int[] array) {
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
  
    private static void printNums(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] nums = { 4, 9, 2, 6, 0 };
        mySort(nums);
  
    }
}

