package com.alswo;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

    public static void main(String[] args) {
    	
        // LinkedHashMap ����
        LinkedHashMap<String, Integer> h1 = new LinkedHashMap<>();

        // ������ �߰�
        h1.put("���", 10);
        h1.put("����", 5);
        h1.put("�޷�", 3);
        
        System.out.println(h1);
        
        System.out.println(h1.replace("���", 1));	// key ������ value �� ����
        System.out.println(h1);

        // �������� ����
        LinkedHashMap<String, Integer> uptedMap = new LinkedHashMap<>();
        
        h1.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())	// comparingByValue ��������
                .forEachOrdered(x -> uptedMap.put(x.getKey(), x.getValue()));
        
        for (Map.Entry<String, Integer> entry : uptedMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            
            System.out.print(key + value + ",");
            
        }
        
        System.out.println();
        
		// �������� ����
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        
        h1.entrySet().stream()	// reverseOrder ��������
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            
            System.out.print(key + value + ",");
        }
    }
}
