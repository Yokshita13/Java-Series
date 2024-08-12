public class rearrage {
    Scanner in = new Scanner(System.in);
        System.out.print("ENTER MATRIX SIZE (M): ");
        int m = in.nextInt();
        int a[][] = new int[m][m];
        System.out.println("ENTER ELEMENTS OF MATRIX");
        for (int i = 0; i < m; i++) {
            System.out.println("ENTER ROW " + (i+1) + ":");
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
                if (a[i][j] < 0) {
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }
        System.out.println("ORIGINAL MATRIX");
        printMatrix(a, m);
        System.out.println("REARRANGED MATRIX");
        printMatrix(a, m);
    
    public static void printMatrix(int a[][], int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
