package com.alswo;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

    public static void main(String[] args) {
    	
        // LinkedHashMap 생성
        LinkedHashMap<String, Integer> h1 = new LinkedHashMap<>();

        // 데이터 추가
        h1.put("사과", 10);
        h1.put("수박", 5);
        h1.put("메론", 3);
        
        System.out.println(h1);
        
        System.out.println(h1.replace("사과", 1));	// key 값으로 value 값 변경
        System.out.println(h1);

        // 오름차순 정렬
        LinkedHashMap<String, Integer> uptedMap = new LinkedHashMap<>();
        
        h1.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())	// comparingByValue 오름차순
                .forEachOrdered(x -> uptedMap.put(x.getKey(), x.getValue()));
        
        for (Map.Entry<String, Integer> entry : uptedMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            
            System.out.print(key + value + ",");
            
        }
        
        System.out.println();
        
		// 내림차순 정렬
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        
        h1.entrySet().stream()	// reverseOrder 내림차순
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            
            System.out.print(key + value + ",");
        }
    }
}
