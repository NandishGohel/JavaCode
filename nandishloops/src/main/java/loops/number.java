package loops;

public class number {
	 public static void Nums(int n) 
	    { 
	        int i, j,num; 
	    
	        for(i=0; i<n; i++) 
	        { 
	            num=1; 
	            for(j=0; j<=i; j++) 
	            { 
	                 System.out.print(num+ " "); 
	                 num++; 
	            } 
	            System.out.println(); 
	        } 
	    } 
	       public static void main(String args[]) 
	    { 
	        int n = 5; 
	        Nums(n); 
	    } 
	}

