package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		List myList =new ArrayList<String>();
		myList.add("abhishek");
		myList.add("suresh");
		myList.add("sandeep");
		myList.add("vishal");
		myList.add("aakash");
		
		for(int i=0;i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}
		
		if(myList.contains("sandeep"))
		{
		   System.out.println("Thirg name in list is :- "+myList.get(2));
		}
		
		System.out.println("list size is :- "+myList.size());
		
		myList.remove("vishal");
		System.out.println("list size is :- "+myList.size());
		
		

	}
	

}
