package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new HashMap();
		
		map.put("Á¶¿îÈ£", 85);
		map.put("È«±æµ¿", 90);
		map.put("µ¿Àå±º", 80);
		map.put("È«±æµ¿", 95);
		System.out.println("ÃÑ Entry ¼ö:"+map.size());
		
		System.out.println(map.get("È«±æµ¿")+"\n");
		
		Set<String> keyset=map.keySet();
		Iterator<String> itr=keyset.iterator();
		
		while(itr.hasNext()) {
			String key=itr.next();
			Integer value=map.get(key);
			
			System.out.println(key+" : "+value);
		}
		
		System.out.println();
		
		map.remove("È«±æµ¿");
		System.out.println("ÃÑ Entry ¼ö:"+map.size());
		
		Set<Map.Entry<String, Integer>> entryset=map.entrySet();
		Iterator<Map.Entry<String, Integer>> itr2=entryset.iterator();
		
		while(itr2.hasNext()) {
			Map.Entry<String, Integer> entry=itr2.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(key+" : "+value);
		}
		map.clear();
		System.out.println("ÃÑ Entry ¼ö:"+map.size());


	}

}
