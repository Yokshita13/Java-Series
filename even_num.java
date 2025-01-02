public class even {
        int i,N,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        N = sc.nextInt();
        int A[] = new int[N];
        for(i=0;i<N;i++)
        {
            System.out.println("Enter "+(i+1)+" Element");
            A[i] = sc.nextInt();
        }
        for(i=0;i<N;i++)
        {
            if(A[i]%2==0)
            {
                s = s+A[i];
            }
        }
        System.out.println("Sum of even number"+s);
}
