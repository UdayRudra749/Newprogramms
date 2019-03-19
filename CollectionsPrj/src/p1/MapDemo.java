package p1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void showMap()
	{
		Map<String,String>map=new TreeMap<String,String>();
		map.put("c","first");
		map.put("56","sec");
		map.put("67","third");
		map.put("45","fourth");
		map.put("46","five");
		//System.out.println(map.get("46"));
		System.out.println(map);
		/*System.out.println(map.keySet());
		System.out.println(map.values());
		Collection<String> c=map.values();
		for(String c1:c)
		{
			System.out.println(c1);
		}*/
		Set<Entry<String,String>>set=map.entrySet();
		System.out.println(set);
	}

	public static void main(String[] args) {
		showMap();

	}

}
