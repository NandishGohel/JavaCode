package loops;
import java.util.Scanner;
public class star {
	 
	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.println("Enter number of rows: "); 
	        int rows = sc.nextInt();
	         for (int r= 0; r<= rows; r++)
	        {
	            for (int s=1; s<=rows-r; s++)
	            {
	                System.out.print(" ");
	            }
	            for (int k=0;k<=r;k++)
	            {
	                System.out.print("*");
	            } 
	                System.out.println("");
	        }
	        sc.close();
	 
	    }
	}
