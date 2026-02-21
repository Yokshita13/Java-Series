public class pyramid {
    public static void main(String[] args){
        int n=4;
        for(int i=0; i<n; i++){
            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //number 1
            for(int j=0; j<i+1; j++){
                System.out.print(j+1);
            }
            //number2
            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
