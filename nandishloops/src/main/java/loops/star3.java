package loops;

public class star3 { public static void printTriagle(int n) 
{ 
	for (int r=0; r<n; r++) 
    { 
    	for (int s=n-r; s>1; s--) 
        { 
            System.out.print(" "); 
        } 
        for (int s=0; s<=r; s++ ) 
        { 
           
            System.out.print("* "); 
        } 

        System.out.println(); 
    } 
} 
 	public static void main(String args[]) 
{ 
    int n = 5; 
    printTriagle(n); 
} 
} 

