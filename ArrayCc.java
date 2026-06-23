

public class ArrayCc {

    public static void BubbleSort(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j = 0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }

            }
        }
    }

    public static void selectionSort(int arr[]){
        for (int i = 0; i<arr.length; i++){
            int minPos =i;
            for(int j = i+1; j<arr.length; j++){
                if( arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void InsertionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            
        }
    }

    public static void printArr(int arr[]){
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        // int arr[] = {5, 4, 1, 3, 2};
        int arr [] =  {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // BubbleSort(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
