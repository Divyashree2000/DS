package Eligibility;

public class Eligible {

	public static void main(String[] args) {
		job();
	}
	static void job()
	{
		int minPercentage=60;
		float sslc_Percentage=96.8f;
		float hsc_Percentage=75f;
		float ug_Percentage=78.67f;
		if(sslc_Percentage>minPercentage)
		{
			if(hsc_Percentage>minPercentage)
			{
				if(ug_Percentage>minPercentage)
				{
					System.out.println("Eligible to apply for a job");
				}
			}
		
		}
		else
		{
			System.out.println("Not Eligible to apply for a job");
		}
	}
}