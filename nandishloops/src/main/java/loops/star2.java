package loops;

public class star2 {
	 public static void Stars(int n) 
	    { 
	        int r, s; 
	        for(r=0; r<n; r++) 
	        { 
	        	for(s=0; s<=r; s++) 
	            { 
	                System.out.print("* "); 
	            } 
	        	System.out.println(); 
	        } 
	   } 
	  public static void main(String args[]) 
	    { 
	        int n = 5; 
	        Stars(n); 
	    } 
	} 
