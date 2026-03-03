package sorting;

public class BubbleSort {
    public static void bubblesort(int numbers[]) {
        int n = numbers.length;
        for (int i = 0; i < n-1; i++) {
            int swap = 0;
            for (int j = 0; j < n - 1 -i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                    swap++;
                }
                
                
            }
            if (swap==0) {
                break;
            }
            
        }

    }
    public static void PrintArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int numbers[] = {5,2,9,1,3};
        bubblesort(numbers);
        PrintArray(numbers);
        
    }
}
