package StudentReport;
import java.util.*;
public class ProgressMarks {

	public static void main(String[] args) {
		switch_case();
	}
		static void switch_case()
		{
			public static int score(int marks)
			{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the mark: ");
			int mark=s.nextInt();
			if(mark<0||mark>100)
			{
				System.out.println("Mark Invakid");
			}
			switch(marks)
			{
			case 1:
				int min_mark=81;
				int max_mark=100;
				if(mark>=min_mark)
				{
					if(mark<=max_mark)
					{
					System.out.println("First Class");	
					}
				}
				else
				{
					System.out.println("Try to get first class");
				}
				break;
			case 2:
				int minMark=61;
				int maxMark=80;
				if(mark>=minMark)
				{
					if(mark<=maxMark)
					{
						System.out.println("Second Class");
					}
				}
				else
				{
					System.out.println("Still need more practice");
				}
				break;
			default:
				System.out.println("Fail");
				break;
			
		}
			}
		}
}
