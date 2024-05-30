package ex_21052024.Abstraction;

public class PrintMyBook extends Book{
	
	PrintMyBook(String name, String author, int price)
	{
		System.out.println("Book name : " +name+ " Author name : " +author+ " Price is : "+price);
	}

	@Override
	void getDetails() {
		System.out.println("Getting the details of the book");
		
	}

}
