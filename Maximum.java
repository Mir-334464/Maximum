import java.util.*;
class Maximum

  {

      public static void main(String[]args)

        {
         
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Number To Check Maximum: ");

     int N=sc.nextInt();

      int rem, Max=0;
        
     
while(N!=0)

     {

      rem=N%10;
    
      if(rem>Max)
       
      Max=rem;

       N=N/10;
      
      }
         
         System.out.println("Maximum Number Is: "+Max);

                 }

     }
          