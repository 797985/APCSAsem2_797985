
/**
 * Write a description of class InsertSort here.
 *
 * @author (Nick Gonzales)
 * @version (1/14)
 */
public class InsertSort
{ 

    //Function to sort array using insertion sort
    public void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int g = i-1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (g>=0 && arr[g] > key) 
            { 
                arr[g+1] = arr[g]; 
                g = g-1; 
            } 
            arr[g+1] = key; 
        } 
    } 
    //prints array
    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int w=0; w<n; ++w) 
            System.out.print(arr[w] + " "); 
  
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    {         
        int arr[] = {21, 12, 17, 2, 8}; 
  
        InsertSort ob = new InsertSort();         
        ob.sort(arr); 
          
        printArray(arr); 
    } 
}
