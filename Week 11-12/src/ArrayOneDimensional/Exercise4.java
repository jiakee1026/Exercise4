package ArrayOneDimensional;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		// The variable list 1 and list 2 are reference arrays that each have 5 elements. Write code that copies the values in list 1 to 2.
		// Values in list 1 are input by users.
		
		int[] list1 = new int[5];
		int[] list2 = new int[5];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < list1.length; i++) {
			list1[i] = in.nextInt();
		}
		System.out.println();
		
		System.out.println("List 1 : ");
		for (int i = 0; i < list1.length; i++) {
			System.out.println(list1[i]);
		}
		System.out.println();
		
		System.out.println("List 2 : ");
		for (int i = 0; i < list2.length; i++) {
			list2[i] = list1[i];
			System.out.println(list2[i]);
		}
		
	}

}
