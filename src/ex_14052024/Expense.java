package ex_14052024;

public class Expense {
	
	//Behaviour
	int DailyAllowance(int no)
	{
		System.out.println("DA from Expense Class");
		return no;
	}
	
	int TravellingAllowance(int dist)
	{
		System.out.println("TA from Expense Class");
		return dist;
	}
	
	String DailyMisc(String headname)
	{
		System.out.println("DailyMisc from Expense Class");
		return headname;
	}

}
