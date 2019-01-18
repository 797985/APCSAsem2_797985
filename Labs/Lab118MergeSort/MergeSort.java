
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
    public static void main(String args[]) 
    { 
        MergeSort object = new MergeSort(); 
        int arr[] = {35,47,15,31,9}; 
        object.mergeSort(arr); 
        System.out.println("Sorted array"); 
        object.printArray(arr); 
    } 
}

