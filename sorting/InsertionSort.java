package sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[] = {5, 2, 9, 1, 3};

        for(int i = 1; i < arr.length; i++) {

            int curr = arr[i];      // element to insert
            int prev = i - 1;       // last index of sorted part

            while(prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];  // shift right
                prev--;
            }

            arr[prev + 1] = curr;   // insert element
        }

        for(int num : arr)
            System.out.print(num + " ");
    }
}