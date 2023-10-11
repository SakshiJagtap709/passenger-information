package PassengerInfo;
import java.util.Scanner;
public class Passenger {

	public static void main( String args[])
	{
		Scanner scanner =new Scanner (System.in);
		System.out.println("Enter the passenger name: ");
		String Long=scanner.next();
		System.out.println("Enter the passenger's age:");
		int age=scanner.nextInt();
		System.out.println("Name : "+Long);
		System.out.println("Age :" +age);
		{
		if (age <=5)
			System.out.println("No ticket");
		}
		
		{
		 if ((age>5) && (age<=10))
			System.out.println( "Half ticket");
			}
		
		{
	      if ((age>10) && (age<=50))
				System.out.println( "Full ticket");
			}
		
		{
		 if (age>50)
				System.out.println( "Half ticket");
			}
	
	}
	}		

