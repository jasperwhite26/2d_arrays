public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {9, 5, 8},
                {4, 6, 7}
        };

        System.out.println("Column Sums: ");
        sumColumn(array);
        System.out.println("Row Sums: ");
        sumRow(array);

    }

    private static void sumColumn(int[][] array) {
        for (int col = 0; col < array[0].length; col++){
            int colSum = 0;
            for (int row = 0; row < array.length; row++){
                colSum += array[row][col];
            }
            System.out.println(colSum);
        }
    }

    private static void sumRow(int[][] array){
        for (int[] row : array){
            int rowSum = 0;
            for (int value : row ){
                rowSum += value;
            }
            System.out.println(rowSum);
        }
    }
}
