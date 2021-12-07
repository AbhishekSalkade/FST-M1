package activities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		Map<Integer, String> colours = new HashMap<Integer, String>();
		colours.put(1, "red");
		colours.put(2, "green");
		colours.put(3, "orange");
		colours.put(4, "blue");
		colours.put(5, "yellow");
		
		System.out.println("map is:- "+colours);
		
		colours.remove(3);
		if(colours.containsValue("green"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		System.out.println(colours.size());
		

	}

}
