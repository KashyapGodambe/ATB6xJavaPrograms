package ex_14052024;

public class RunnerClassAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAcc s = new SavingsAcc();
		int amt = s.deposit(15000);
		System.out.println(amt);
		
		Account a = new SavingsAcc();
		int amt1 = a.deposit(10000);
		System.out.println(amt1);
		
		Account a2 = new Account();
		int amt2 = a2.deposit(200);
		System.out.println(amt2);
		
		 	
		

	}

}
