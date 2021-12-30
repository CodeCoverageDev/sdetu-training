package datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
	// 1. Implement map interfaces
	Map< Integer, String> hashMap = new HashMap<Integer, String>();
	mapUtil(hashMap);

    }

    public static void mapUtil(Map<Integer, String> map) {
	// 1, Add Key - Value Pairs
	map.put(101, "Steve");
	map.put(502, "Roger");
	map.put(22, "Jennifer");
	map.put(315, "Mika");
	map.put(36, "Ellie");
	map.put(750, "Kelly");

	// 2. Expose/ access elements
	System.out.println("See all the keys: " + map.keySet());
	System.out.println("See all key-value pairs: " + map);
	System.out.println(map.get(502));

	// 3. Iterate through map of key-value pairs?
	for (int key : map.keySet()) {
	    System.out.println("[Key: " + key + ". Value: " + map.get(key) + " ]");
	}
    }
}
