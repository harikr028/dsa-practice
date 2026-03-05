import java.util.Scanner;

public class LargestArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length;

        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int largest = matrix[0][0];
        int row = 0;
        int col = 0;

        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                    row = i;
                    col = j;
                }

            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Index: (" + row + ", " + col + ")");
    }
}