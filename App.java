package com.ontariotechu.sofe3980U;
import java.util.Scanner;
import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		Scanner binary_input = new Scanner(System.in);
		LocalTime currentTime = new LocalTime();

		System.out.println("Binary Calculator:");
		System.out.println("The current local time is: " + currentTime + "\n");


		System.out.println("Enter a binary value\n");
		Binary binary1 = new Binary(binary_input.next());
		System.out.println("Enter a second binary value\n");
		Binary binary2 = new Binary(binary_input.next());

		//print input values
		System.out.println("First binary value: " + binary1.getValue());
		System.out.println("Second binary value: " + binary2.getValue()+"\n");


		//Addition
		Binary add = Binary.add(binary1,binary2);
		System.out.println("The sum is:" + add.getValue());

		//AND
		Binary and = Binary.and(binary1,binary2);
		System.out.println("And result is:" + and.getValue());

		//OR
		Binary or = Binary.or(binary1,binary2);
		System.out.println("OR result is:" + or.getValue());

		//Multiply
		Binary multiply = Binary.multiply(binary1,binary2);
		System.out.println("Multiplied result is " + multiply.getValue());


		binary_input.close();
    }
}
