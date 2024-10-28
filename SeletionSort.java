public class SeletionSort {

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[minIdx] > arr[j] ){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

        }
    }
    public static void printArray(int arr[]){
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {12, 78, 9, 90};
        selectionSort(arr);
        printArray(arr);
    }
}