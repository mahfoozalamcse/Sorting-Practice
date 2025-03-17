public class BubbleSort {
    public static void bubbleSort(int arr[], int n){
     
        boolean swapped; 
        
        for(int i = 0; i < n; i++){
            
            swapped = false;
            
            for(int j = 0; j < n - i - 1; j++){
                if( arr[j] > arr[j + 1]){
                    
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swapped = true;
                    
                }
            }
            if(swapped == false)
            break;
        }
    
       
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+" ");
        }
        System.out.println();
      }
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 78, 9};
        bubbleSort(arr, 5);
        printArray(arr);
    }
}
