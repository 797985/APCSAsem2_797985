
/**
 * Write a description of class MergeSort here.
 *
 * @author (Nick Gonzales)
 * @version (1/18)
 */
public class MergeSort
{
   
    
    public static void mergeSort(int[] a, int n)
    {
        int array[];
        
        if (n<2) {return;}
            int mid = n/2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];
            for (int i=0; i<mid; i++){
                l[i] = a[i];
            }
            for (int i = mid; i < n; i++){
                r[i-mid] = a[i];
            
            }
        mergeSort(l, mid);
        mergeSort(r, n-mid);
        //helper function
        merge(a, l, r, mid, n-mid);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
            a[k++] = l[i++];
            }else {
            a[k++] = r[j++];
            }
        }
        while (i < left) { a[k++] = l[i++];}
        while (j < right) {a[k++] = r[j++];}

    }
    public void printArray(int arr[]) 
    { 
        int r = arr.length; 
        for (int l=0; l<r; ++l) 
            System.out.print(arr[l]+" "); 
        System.out.println(); 
    }
    //organizeing my student number and random stuNums that I made up
    public static void main(String args[]) 
    { 
        MergeSort object = new MergeSort(); 
        int array[] = {797985, 797845, 795784, 799103, 796385, 787281}; 
        object.mergeSort(array); 
        System.out.println("Sorted array"); 
        object.printArray(array); 
    } 
}

