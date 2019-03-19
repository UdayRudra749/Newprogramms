package p1;

import java.util.*;

public class ListItEx {
	public static void showList()
	{
		List<String> list = new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		System.out.println("Forward direction");
		ListIterator<String> it = list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		System.out.println("Backward direction");
		//ListIterator<String> list=list.listIterator();
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      showList();
      
	}

}
