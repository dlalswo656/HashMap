package com.alswo;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<>();
		HashMap<Integer, String> h2 = new HashMap<>();
		
		// 1. 데이터 추가
		h1.put(3, "3333");
		h1.put(1, "1111");
		h1.put(2, "2222");
		h1.putIfAbsent(1, "0000");		// 기존 데이터에 key가 없으면 key와 value를 저장
		h1.putIfAbsent(4, "4444");
		
		h2.putAll(h1);
		
		System.out.println("h1 : " + h1);
		System.out.println("h2 : " + h2);
		
		// 데이터 확인
		System.out.println(h1.containsKey("aaaa"));		// key와 일치하는 데이터가 있는지 비교
		System.out.println(h1.containsValue("3333"));	// value와 일치하는 데이터가 있는지 비교
		System.out.println(h2.containsKey(h2));
		
		// 데이터 수정
		System.out.println(h1.replace(2, "0000"));	// key와 일치하는 value 값을 변경
		System.out.println(h1.replace(1, "1111", "0101"));	// key와 value의 값이 일치하는 데이터의 value를 newValue로 값을 변경
		System.out.println(h1.replace(2, "0000", "2222"));
		
		System.out.println(h1);	
		
		// key 출력
		System.out.println(h1.keySet()); 
		System.out.println(h2.keySet());
		
		// value 출력
		System.out.println(h1.values());
		System.out.println(h2.values());

		
		// 데이터 삭제
		System.out.println(h1.remove(4, "4444"));	// 일치하는 key, value 기준 데이터를 삭제
		h1.clear();
		
		System.out.println(h1);
	
	}
}
