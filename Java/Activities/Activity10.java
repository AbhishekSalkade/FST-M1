package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("six");
		
		System.out.println("hash set size is :- "+hs.size());
		hs.remove("five");
		System.out.println("hash set size is :- "+hs.size());
		hs.remove("fivepppp");
		System.out.println("hash set size is :- "+hs.size());
		if(hs.contains("two"))
		{
			System.out.println("element is present in hesh set");
		}
		else
		{
			System.out.println("element is not present in hesh set");
		}
		
		System.out.println(hs);

	}

}
