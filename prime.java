import java.util.*; 

class prime 

{ 

 public static void main(String args[]) 

 { 

  int i,c=0; 

  Scanner sc = new Scanner(System.in); 

  System.out.println("Enter a number"); 

  int number = sc.nextInt(); 

  for(i=1; i<=number; i++); 

  { 

   if(number%i==0) 

   { 

    c++; 

   } 

  } 

  if(c==2) 

  { 

  System.out.println("Prime number"); 

  } 

  else 

  { 

    System.out.println("It is not a prime number"); 

  } 

 } 

} 
