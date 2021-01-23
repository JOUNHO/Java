package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new HashMap();
		
		map.put("����ȣ", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		System.out.println("�� Entry ��:"+map.size());
		
		System.out.println(map.get("ȫ�浿")+"\n");
		
		Set<String> keyset=map.keySet();
		Iterator<String> itr=keyset.iterator();
		
		while(itr.hasNext()) {
			String key=itr.next();
			Integer value=map.get(key);
			
			System.out.println(key+" : "+value);
		}
		
		System.out.println();
		
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��:"+map.size());
		
		Set<Map.Entry<String, Integer>> entryset=map.entrySet();
		Iterator<Map.Entry<String, Integer>> itr2=entryset.iterator();
		
		while(itr2.hasNext()) {
			Map.Entry<String, Integer> entry=itr2.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println(key+" : "+value);
		}
		map.clear();
		System.out.println("�� Entry ��:"+map.size());


	}

}
