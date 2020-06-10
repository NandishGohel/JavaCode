package loops;

public class exceptionDemo {
	public static void main(String args[])
	   {
	      try{
	        int a[]=new int[5];
	        a[10] = 50;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBounds");
	      }
	      System.out.println("hello");
	   }
	}

