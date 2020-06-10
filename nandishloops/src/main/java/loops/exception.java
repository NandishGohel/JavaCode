package loops;

public class exception {
	public static void main(String args[])
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch( Exception e ) {
			System.out.println("String is null");
		}
		System.out.println("hello");
	}
}
