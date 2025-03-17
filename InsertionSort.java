public class InsertionSort {
      // Function to perform insertion sort
        public static void insertionSort(int[] arr) {
            int n = arr.length; // Length of the array   
       
            // Iterate from the second element to the last 
            for (int i = 1; i < n; i++) {
                int key = arr[i]; // The current element to be inserted
                int j = i - 1; // The last index of the sorted portion
    
                // Shift elements of the sorted portion to the right
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j]; // Move the element one position to the right
                    j--; // Move to the next element in the sorted portion
                }
    
                // Place the key element in its correct position
                arr[j + 1] = key;
            }
        }
    
       
    
        // Main method to test the insertion sort practice
       
    // public static void insertionsort2(int[] arr){
    //    int n = arr.length;
    //    for (int i = 1; i < n; i++) {
    //        int key = arr[i];
    //        int j = i-1;

    //        while (j>=0 && arr[j] > key) {
    //            arr[j+1] = arr[j];
    //            j--;
    //        }
    //        arr[j+1] = key;
    //    }
    // }

    
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+" ");
        }
        System.out.println();
      }
    public static void main(String[] args) {
        int arr[] = {12, 77, 89, 90, 8};
        
        insertionSort(arr);
        printArray(arr);
        // insertionsort2(arr);
        // printArray(arr);
        
    }
}
