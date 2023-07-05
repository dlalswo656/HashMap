package com.alswo;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<>();
		HashMap<Integer, String> h2 = new HashMap<>();
		
		// 1. ������ �߰�
		h1.put(3, "3333");
		h1.put(1, "1111");
		h1.put(2, "2222");
		h1.putIfAbsent(1, "0000");		// ���� �����Ϳ� key�� ������ key�� value�� ����
		h1.putIfAbsent(4, "4444");
		
		h2.putAll(h1);
		
		System.out.println("h1 : " + h1);
		System.out.println("h2 : " + h2);
		
		// ������ Ȯ��
		System.out.println(h1.containsKey("aaaa"));		// key�� ��ġ�ϴ� �����Ͱ� �ִ��� ��
		System.out.println(h1.containsValue("3333"));	// value�� ��ġ�ϴ� �����Ͱ� �ִ��� ��
		System.out.println(h2.containsKey(h2));
		
		// ������ ����
		System.out.println(h1.replace(2, "0000"));	// key�� ��ġ�ϴ� value ���� ����
		System.out.println(h1.replace(1, "1111", "0101"));	// key�� value�� ���� ��ġ�ϴ� �������� value�� newValue�� ���� ����
		System.out.println(h1.replace(2, "0000", "2222"));
		
		System.out.println(h1);	
		
		// key ���
		System.out.println(h1.keySet()); 
		System.out.println(h2.keySet());
		
		// value ���
		System.out.println(h1.values());
		System.out.println(h2.values());

		
		// ������ ����
		System.out.println(h1.remove(4, "4444"));	// ��ġ�ϴ� key, value ���� �����͸� ����
		h1.clear();
		
		System.out.println(h1);
	
	}
}
