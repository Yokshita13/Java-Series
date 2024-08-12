public class MatrixDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix:");
        printMatrix(matrix);
        
        System.out.println("\nMain Diagonal:");
        printDiagonal(matrix, true);
        
        System.out.println("\nAnti-Diagonal:");
        printDiagonal(matrix, false);
    }

    public static void printDiagonal(int[][] matrix, boolean isMainDiagonal) {
        int n = matrix.length; // Assuming matrix is square
        
        if (isMainDiagonal) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][i] + " ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][n - 1 - i] + " ");
            }
        }
        System.out.println();
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
