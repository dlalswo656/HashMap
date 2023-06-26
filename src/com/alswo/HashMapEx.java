package com.alswo;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String, String>();
		HashMap<String, String> h2 = new HashMap<String, String>();
		
		h1.put("aaaa", "1111");
		h1.put("bbbb", "2222");
		h1.put("cccc", "3333");
		h1.putIfAbsent("aaaa", "0000");		// ���� �����Ϳ� key�� ������ key�� value�� ����
		h1.putIfAbsent("dddd", "4444");
		h2.putAll(h1);
		System.out.println("h1 : " + h1);
		System.out.println("h2 : " + h2);
		
		System.out.println(h1.containsKey("aaaa"));		// key�� ��ġ�ϴ� �����Ͱ� �ִ��� ��
		System.out.println(h1.containsValue("3333"));	// value�� ��ġ�ϴ� �����Ͱ� �ִ��� ��
		System.out.println(h2.containsKey(h2));
		
		System.out.println(h1.remove("cccc", "3333"));	// ��ġ�ϴ� key, value ���� �����͸� ����
		System.out.println(h1.replace("aaaa", "2222"));	// key�� ��ġ�ϴ� value ���� ����
		System.out.println(h1.replace("aaaa", "2222", "1111"));	// key�� value�� ���� ��ġ�ϴ� �������� value�� newValue�� ���� ����
		
		System.out.println(h1);
	}

}
