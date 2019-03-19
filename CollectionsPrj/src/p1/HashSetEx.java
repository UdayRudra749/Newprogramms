package p1;

import java.util.*;


public class HashSetEx {

	public static void showSet() 
	{
		Set<String>hset=new LinkedHashSet<String>();
		hset.add("ABC");
		hset.add(null);
		hset.add("abc");
		//hset.add("abc");// here only removal of duplicates so this duplicated one cannot be prnted
		hset.add("123");
		hset.add("A12B");
		hset.add("1234");
		//hset.add(null); it removes even duplicated null, anyways null will be printed 
		//first (depends on the compiler)
		hset.add("@");
		System.out.println(hset);
		Iterator<String> it=hset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	

}



	public static void showTreeSet() 
	{
		Set<String>tset=new TreeSet<String>();
		tset.add("ABC");
		tset.add("AB");
		tset.add("ab");
		//tset.add("abc");// here only removal of duplicates so this duplicated one
		//cant be printed
		tset.add("123");
		//tset.add(null); //treeset doesnt allow null value since in treeset sorting occurs
		tset.add("A12B");
		tset.add("@");
		System.out.println(tset);
		Iterator<String> it=tset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	

}	

	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	showTreeSet();
	

}

}
