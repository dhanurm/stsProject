package com.clc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exampl2 {
	
	public static void main(String[] args) {
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(1, "Dhanu");
		map.put(2, "Dhanu");
		map.put(4, "lmn");
		map.put(5, "Mane");
		map.put(3, "pqr");
		map.put("xyz", 2);
		map.put(8, "Dhanu");
		
		
//		int[] arr= new int[5];
//		System.out.println(arr.length);
//		int[] copyOf = Arrays.copyOf(arr, arr.length+6);
//		System.out.println(copyOf.length);

		Set<Object> key = new LinkedHashSet<Object>();
		for (Entry<Object, Object> entry : map.entrySet()) {
			if (entry.getValue().equals("Dhanu")) {
				key.add(entry.getKey());
			}
		}

		for (Object o : key) {
			System.out.println("Keys.." + o);
		}

		Collection<Object> values = map.values();

		System.out.println(values);
	}

}
