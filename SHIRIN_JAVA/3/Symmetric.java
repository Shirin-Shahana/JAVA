import java.util.Scanner;
class Symmetric
{
 public static void main(String args[])
{
     int i,j,flag=0;

    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of rows ad columns Matrix 1: ");
      int r1=sc.nextInt();
      int c1=sc.nextInt();

    int matrix1[][]=new int[r1][c1];
  
    System.out.println("Enter the values for Matrix 1: ");
      for(i=0;i<r1;i++)
         {
            for(j=0;j<c1;j++)
             { 
 	matrix1[i][j]=sc.nextInt();
             }
         }

  int matrix2[][]=new int[r1][c1];
   
    for(i=0;i<r1;i++)
         {
            for(j=0;j<c1;j++)
             { 
 	matrix2[i][j]=matrix1[j][i];
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


System.out.println("TRANSPOSE OF MATRIX 1 : ");
      for(i=0;i<r1;i++)
         {
            for(j=0;j<c1;j++)
             { 
 	System.out.print("    "+matrix2[i][j]);
             }
                System.out.println();
         }
  
       for(i=0;i<r1;i++)
         {
            for(j=0;j<c1;j++)
             {
                  if(matrix1[i][j]==matrix2[i][j])
                       flag=flag+1;     
             }
         }
             
       if(flag==r1*c1)
             System.out.println("This is a Symmteric Matrix ");
        else
             System.out.println("This is not a Symmteric Matrix ");
     }
 }





