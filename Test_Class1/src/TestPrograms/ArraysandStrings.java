package TestPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysandStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr= new ArrayList<Integer>(Arrays.asList(2,3,5,4));
		String str="Christy";
		
		//try to change the elements
		arr.set(0, 100);
		str.replace('y', 'i');
		
		String newstr= str.replace('y', 'i');
		
		
		//print the elements
		System.out.println(arr);
		System.out.println(str);
		System.out.println(newstr);
	}

}
