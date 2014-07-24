package links;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	
	public static void main(String args)
	{
		List list = new LinkedList();
		ListIterator il = list.listIterator();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		
		System.out.print("Enter N :");
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		try {
			String input = br.readLine();
			int n = Integer.parseInt(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
