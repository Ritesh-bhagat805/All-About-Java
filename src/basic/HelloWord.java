/**
 * 
 */
package basic;

import java.util.Scanner;

/**
 * @author ritesh bhagat
 *
 */
public class HelloWord {

	/**
	 * 
	 */
	public HelloWord() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	static int j = 80;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello World");
		int a = 2;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a - b);
		int j = 80;
		j = 50;
		final int i = 20;
		System.out.println(i);
		System.out.println(j);
		
		String name = "rits";
		System.out.println(name);
		int p = 8, r = 5, s = 6;
		float t = 80.12f;
		System.out.println(p);
		System.out.println(t);
		 
		boolean arc = true;
		System.out.println(arc);	
		
		/*Two tpes of Data Type:
		 * 1. Primitive - byte (1 byte), short (2 bytes), int(4 bytes), long(8 bytes), float(4 bytes),
		 * double (8 bytes), boolean(1 bit), char (2 bytes).
		 * 
		 * 2. Non Primitive or Reference Data Type.   
		 */
		byte u = -65;
		System.out.println(u);
		double d = 80.298743d;
		System.out.println(d);
		char grade = 'K';
		System.out.println(grade);
		
		/*operators in java
		 */
		
		int num1 = 45, num2 = 78; 
		// Expoler these operator - += , -+ , *=,
		System.out.println("The value of num1 + num2 is" );
		System.out.println(num1 + num2);
		 
		System.out.println("The value of num1 - num2 is" );
		System.out.println(num1 - num2);
		 
		System.out.println("The value of num1 * num2 is" );
		System.out.println(num1 * num2);
		
		// Taking user input in Java:
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input");
		String input = scan.nextLine();
		System.out.println(input);
		
		//How to Declare variables:
		//syntax - <dataType>  <variableName> = <value>;\
		 
		String Name = "Ritesh";
		String Channel = "pune";
		System.out.println(Name + " Form " + Channel);
		System.out.println(Name + " Form\" " + Channel);
		System.out.println(Name + " Form\\ " + Channel);	
		System.out.println(Name + " Form\t " + Channel);
		System.out.println(Name + " Form\n " + Channel);
		
		System.out.println(name.contains("rit"));
		System.out.println(name.charAt(2));    //shows index:
		 
		System.out.println(name.endsWith("tesh"));
		System.out.println(name.indexOf("Rite"));
		
		int numb1 = 4, numb2 = 7;
		System.out.println(Math.max(numb1, numb2));      //shows (Maximum) no:
		System.out.println(Math.min(numb1, numb2));      //shows (Minimum) no:
		
		
		
		
		
	}  

}
