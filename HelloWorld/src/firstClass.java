import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class firstClass {
	public static void  main(String args[]) {
		String name = "Vladimir Valdés";
		String degree = "IT";
		String hobbies = "I love programming, listen to music, sing and others";
		int age = 23;
		
		
		long amount = 3_200_10000000_000L;
		float price = 4.53F;
		
		Date now = new Date();
		
		String message = "c:\\Windows\\...";
		
		int [] numbers = {2, 1, 3, 4, 5 };
	
		// Constants
		final float PI = 3.14F;
		
		double result = (double)10 / (double) 3;
		
		
		System.out.println("Result of division: " + result );		
		
		
		
		
		
		
		System.out.print(now);
		System.out.print("\n My name is " + name + " I studied " + degree + " My hobbies are: "
				+ hobbies + " and I am " + age + "\n" );
		System.out.print(message + "\n");
		System.out.print("\n" + Arrays.toString(numbers));
		
		
		NumberFormat percent  = NumberFormat.getPercentInstance();
		String  result2  = percent.format(0.1);
		System.out.print("Percent values:" +  result2 );

	}
}
