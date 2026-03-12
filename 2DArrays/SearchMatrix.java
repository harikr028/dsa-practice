public class SearchMatrix {

    public static boolean search(int matrix[][], int key){

        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while(row < n && col >= 0){

            if(matrix[row][col] == key){
                System.out.println("Found at (" + row + "," + col + ")");
                return true;
            }

            else if(key < matrix[row][col]){
                col--;
            }

            else{
                row++;
            }
        }

        System.out.println("Not found");
        return false;
    }

    public static void main(String args[]){

        int matrix[][] = {
            {1,4,7,11},
            {2,5,8,12},
            {3,6,9,16},
            {10,13,14,17}
        };

        search(matrix, 9);
    }
}