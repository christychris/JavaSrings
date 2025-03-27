package TestPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysandStrings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an arrayList
		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple","orange","mango","kiwi"));
		
		//adding an element
		fruits.add("pineapple");
		//insert element at the specified location
		fruits.add(0,"avacaodo");	
		//remove element
		fruits.remove("orange");
		//accessing element using index
		String fruit=fruits.get(0);
		System.out.println(fruit);
		System.out.println(fruits);
		
		//converting static array to arrayList
		String[] fruitArray = {"apple","mango", "kiwi"};
		ArrayList<String> fruitList = new ArrayList<String>(Arrays.asList(fruitArray));
		
		//converting arraylist to static array
		String[] fruitArr = fruitList.toArray(new String[0]);
		

	}

}
