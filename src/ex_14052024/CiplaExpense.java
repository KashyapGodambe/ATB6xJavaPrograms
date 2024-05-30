package ex_14052024;

public class CiplaExpense extends Expense{
	int DailyAllowance(int no)
	{
		System.out.println("DA from Cipla Expense");
		return no;
	}
	
	int TravellingAllowance(int dist)
	{
		System.out.println("TA from Cipla Expense");
		return dist;
	}
	
	String DailyMisc(String headname)
	{
		System.out.println("DailyMisc from Cipla Expense");
		return headname;
	}

}
