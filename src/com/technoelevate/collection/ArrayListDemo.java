package com.technoelevate.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(11);
		al.add(35);
		al.forEach(ar->System.out.println(ar));//foreach()
		System.out.println("Using For Loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("Using ForEach Loop");
		for(int i : al) {
			System.out.println(i);
		}
		System.out.println("Using Iterator");
		Iterator i = al.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
			
			
		}
		System.out.println("Using ListIterator");
		ListIterator li = al.listIterator();
		System.out.println("Forward Iteration");
		while(li.hasNext()) {
		
			System.out.println(li.next());
		}
		System.out.println("Backward Iteration");
		
		ListIterator li1 = al.listIterator(al.size());
		while(li1.hasPrevious()) {
			
			System.out.println(li1.previous());
		}

	}

}
