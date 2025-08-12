public class SelectionSort {
    //logic for increasing order
    public static void IncreasingOrderselectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            int MinPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[MinPos] > arr[j]){
                    MinPos = j;
                }
            }
            //swaping
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp;
        }
    }

    //logic for decreasing order
    public static void DecreasingOrderselectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            int MinPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[MinPos] < arr[j]){
                    MinPos = j;
                }
            }
            //swaping
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        IncreasingOrderselectionSort(arr);
        System.out.print("Increasing order:");
        printArr(arr);
        DecreasingOrderselectionSort(arr);
        System.out.print("Decreasing order:");
        printArr(arr);
    }
}
