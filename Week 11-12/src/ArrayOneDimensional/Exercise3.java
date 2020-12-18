package ArrayOneDimensional;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		// write a program that create an array of 10 element,
		// your program should prompt the users to input numbers in array and display the sum of all element
		
		int[] numbers = new int[10];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter numbers: ");
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Sum numbers :" + sum);
	}

}
