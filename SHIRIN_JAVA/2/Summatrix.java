import java.util.Scanner;
class Summatrix
{
 public static void main(String args [])
 {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of rows ad columns Matrix 1: ");
      int r1=sc.nextInt();
      int c1=sc.nextInt();

    int matrix1[][]=new int[r1][c1];

  System.out.println("Enter the number of rows ad columns Matrix 2: ");
      int r2=sc.nextInt();
      int c2=sc.nextInt();

    int matrix2[][]=new int[r2][c2];

 if(r1==r2 && c1==c2)
  {
     System.out.println("Enter the values for Matrix 1: ");
      int i,j;
      for(i=0;i<r1;i++)
         {
            for(j=0;j<c1;j++)
             { 
 	matrix1[i][j]=sc.nextInt();
             }
         }
  
   System.out.println("Enter the values for Matrix 2: ");
      for(i=0;i<r2;i++)
         {
            for(j=0;j<c2;j++)
             { 
 	matrix2[i][j]=sc.nextInt();
             }
         }

     System.out.println("MATRIX 1: ");
      for(i=0;i<r1;i++)
         {
            for(j=0;j<c1;j++)
             { 
 	System.out.print("    "+matrix1[i][j]);
             }
                System.out.println();
         }
  
     System.out.println("MATRIX 2: ");
      for(i=0;i<r2;i++)
         {
            for(j=0;j<c2;j++)
             { 
 	System.out.print("    "+matrix2[i][j]);
             }
                System.out.println();
         }
 

      System.out.println("Addition of Matrix1 and Matrix2 ");
    
      int matrix3[][]=new int[r1][c1];
      for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
              {
                 matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
                 System.out.print("    "+matrix3[i][j]);
              }
                 System.out.println();
         }
  }
   else
         System.out.println("ERROR");
}
}         



      
       


