package Learning;
import java.util.*;
public class Datatype {

	public static void main(String[] args) 
	{
		Display();
	}
	
		static void Display()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter first letter: ");
			char a1=sc.next().charAt(0);
			System.out.println("Enter second letter: ");
			char a2=sc.next().charAt(0);
			System.out.println("Enter third letter: ");
			char a3=sc.next().charAt(0);
			System.out.println("Enter fourth letter: ");
			char a4=sc.next().charAt(0);
			System.out.println("Enter fifth letter: ");
			char a5=sc.next().charAt(0);
			System.out.println("The reverse form is: "+a5+a4+a3+a2+a1);
			
		}
} 
