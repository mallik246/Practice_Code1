package practice_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max_Mini_Number {

	public static void main(String[] args) {
		
		List<Integer> obj=new ArrayList<Integer>();
		
		obj.add(3);
		obj.add(5);
		obj.add(8);
		obj.add(15);
		
		System.out.print(obj);
		
		int maximum=Collections.max(obj);
		int minimum=Collections.min(obj);
		
		System.out.print("The Maximum namber is " + maximum);
		
		System.out.print("The Minimum nuber is " +minimum);
		

	}

}
