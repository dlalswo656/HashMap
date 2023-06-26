package com.alswo;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String, String>();
		HashMap<String, String> h2 = new HashMap<String, String>();
		
		h1.put("aaaa", "1111");
		h1.put("bbbb", "2222");
		h1.put("cccc", "3333");
		h1.putIfAbsent("aaaa", "0000");		// 기존 데이터에 key가 없으면 key와 value를 저장
		h1.putIfAbsent("dddd", "4444");
		h2.putAll(h1);
		System.out.println("h1 : " + h1);
		System.out.println("h2 : " + h2);
		
		System.out.println(h1.containsKey("aaaa"));		// key와 일치하는 데이터가 있는지 비교
		System.out.println(h1.containsValue("3333"));	// value와 일치하는 데이터가 있는지 비교
		System.out.println(h2.containsKey(h2));
		
		System.out.println(h1.remove("cccc", "3333"));	// 일치하는 key, value 기준 데이터를 삭제
		System.out.println(h1.replace("aaaa", "2222"));	// key와 일치하는 value 값을 변경
		System.out.println(h1.replace("aaaa", "2222", "1111"));	// key와 value의 값이 일치하는 데이터의 value를 newValue로 값을 변경
		
		System.out.println(h1);
	}

}
