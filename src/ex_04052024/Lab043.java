package ex_04052024;

public class Lab043 {

	public static void main(String[] args) {
		// TODO String practise prg 1
		//Reverse a String without using any function or using for loop.
		
		String original = "Hello World!";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

	}

}
