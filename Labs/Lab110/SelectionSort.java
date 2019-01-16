 
/**
 * Write a description of class SelectSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSort 
{ 
    public void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int s = 0; s < n-1; s++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = s; 
            for (int m = s+1; m < n; m++) 
                if (arr[m] < arr[min_idx]) 
                    min_idx = m; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[s]; 
            arr[s] = temp; 
        } 
    } 
  
    // Prints the array 
    public void printArray(int arr[]) 
    { 
        int r = arr.length; 
        for (int l=0; l<r; ++l) 
            System.out.print(arr[l]+" "); 
        System.out.println(); 
    } 
  
    // Driver code to test above 
    public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int arr[] = {82,47,15,31,9}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
} 
   