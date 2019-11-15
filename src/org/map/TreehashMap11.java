package org.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreehashMap11 {
public static void main(String[] args) {
        LinkedHashMap<Integer, String> f = new LinkedHashMap<Integer, String>();
        f.put(10,"java" );
        f.put(20,"sql" );
        f.put(30,"oops" );
        f.put(40,"DB" );
        f.put(50,"psql" );
        f.put(10,"oracle" );
        System.out.println(f);
        System.out.println(f.keySet());
        System.out.println(f.values());
        Set<Entry<Integer, String>> y = f.entrySet();
        for (Entry<Integer, String> x : y) {
        	System.out.println(x);
        	System.out.println(x.getValue());
        	System.out.println(x.getKey());
			
		}
        
}
}
