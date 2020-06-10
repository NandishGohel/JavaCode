package loops;

public class throwexception {
	public static void main(String args[])
	{
		int age=19;
		if (age<18)
		{
			throw new youngerageexceptional("you are not eligible");
		}
		System.out.println("helo");
	}
}
	
