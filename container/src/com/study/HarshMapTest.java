package com.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HarshMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String value = map.put("a", "A");
        System.out.println(value);
        value = map.put("aa", "apple");
        System.out.println(value);
        System.out.println(map.get("aa"));
        map.put("cd", "cat");
        map.put("ab", "black");

        map.put("d", "dog");
        for (String str : map.keySet())
            System.out.println(str+" " + map.get(str));
        System.out.println("---------------");
        for (String str : map.values())
            System.out.println(str);
        System.out.println("---------------");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry:entrySet){
            String key = entry.getKey();
            String v = entry.getValue();
            System.out.println(key + ": " + v);
        }

        System.out.println("---------------");
        Map<String,String> map2 = new HashMap<>();
        map2.put("e","egg");
        map2.put("c","cc");
        map2.putAll(map);
        Set<String> keys = map2.keySet();
        for (String key:keys) {
            System.out.println(map2.get(key));
        }

        System.out.println("---------------");
        String v= map.remove("c");
        System.out.println(v);
        for (String key:map.keySet()){
            System.out.println("key: "+key+" value: "+map.get(key));
        }

        System.out.println("---------------");
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsKey("aq"));
        System.out.println(map.containsValue("apple"));
    }
}
