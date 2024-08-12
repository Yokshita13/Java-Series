import java.util.Random;

public class MatrixRange {
    public static void main(String[] args) {
        int rows = 3;       // Number of rows
        int cols = 4;       // Number of columns
        int minValue = 10;  // Minimum value in the range
        int maxValue = 50;  // Maximum value in the range
        
        int[][] matrix = generateMatrix(rows, cols, minValue, maxValue);
        printMatrix(matrix);
    }

    public static int[][] generateMatrix(int rows, int cols, int minValue, int maxValue) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(maxValue - minValue + 1) + minValue;
            }
        }
        
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}
