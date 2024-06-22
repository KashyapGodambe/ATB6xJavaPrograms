package ex_18062024;

public class BuilderPatternJava {

	
		// Builder pattern
		
		public BuilderPatternJava groundFloor()
		{
			System.out.println("Do tasks for Ground floor");
			return this;
		}
		
		public BuilderPatternJava firstFloor(String name)
		{
			System.out.println("Do tasks for First floor " +name);
			return this;
		}
		
		public BuilderPatternJava secondFloor(String name, String color)
		{
			System.out.println("Do tasks for Second floor " +name +color);
			return this;
		}
		
		
		public static void main(String[] args)
		{
			BuilderPatternJava bp = new BuilderPatternJava();
//			bp.groundFloor();
//			bp.firstFloor("Satya");
//			bp.secondFloor("Mand Badak", "yellow");
			
			bp.groundFloor().firstFloor("Raghu").secondFloor("ManuPeter", "Yellow");
		}

	

}
