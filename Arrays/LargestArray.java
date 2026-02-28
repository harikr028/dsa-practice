public class LargestArray {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        
        int numbers[] = {10,0,59,40,90,12,33};

        System.out.println("Largest Value in the given array is "+getlargest(numbers));
    }

}
