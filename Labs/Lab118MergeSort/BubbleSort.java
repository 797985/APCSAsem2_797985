
/**
 * Write a description of class BubbleSort here.
 *
 * @author (Nick Gonzales)
 * @version (1/18/19)
 */
public class BubbleSort
{
    public void bubbleSort(int array[]) 
    { 
        int n = array.length; 
        for (int i = 0; i < n-1; i++) 
            for (int g = 0; g < n-i-1; g++) 
                if (array[g] > array[g+1]) 
                { 
                    //swaps array[j+1] and array[i]
                    //I used temp as a temporary value so I can swap them
                    int temp = array[g]; 
                    array[g] = array[g+1]; 
                    array[g+1] = temp; 
                } 
    } 
  
    //Prints the array 
    public void printArray(int array[]) 
    { 
        int n = array.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    } 
  
    //method to test the method above
    public static void main(String args[]) 
    { 
        BubbleSort object = new BubbleSort(); 
        int array[] = {66, 34, 25, 2, 22, 11}; 
        object.bubbleSort(array); 
        System.out.println("Sorted array"); 
        object.printArray(array); 
    } 
}

