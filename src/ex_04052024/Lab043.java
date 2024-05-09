package ex_04052024;

public class Lab043 {

	public static void main(String[] args) {
		// TODO String practise prg 1
		//Reverse a String without using any function or using for loop.
		
		String original = "Hello World!"; //12-1
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        //System.out.println(original.length());
        
        //System.out.println(original.charAt(11));
//        
//        The below for loop won't work, since indexing start from 0.
        
//        for (int i = original.length(); i > 0; i--) {
//            reversed += original.charAt(i);
//        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

	}

}
