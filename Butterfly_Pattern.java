class butterflyPattern {
    public static void main(String[] args) {
        int n = 4;

        // Upper half
        for (int i = 0; i < n; i++) {

            // left stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            // spaces 
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = i + 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 0; i < n; i++) {

            // left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }

            // right stars
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

