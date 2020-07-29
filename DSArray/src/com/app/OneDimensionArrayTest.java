package com.app;

public class OneDimensionArrayTest {
	
	public static void main(String[] args) {
		OneDimensionArray a = new OneDimensionArray(10);
		
		a.insert(0, 10);
		a.insert(1, 20);
		a.insert(2, 30);
		System.out.print("The Array is: ");
		
		a.traversing();
		System.out.println();
		
		System.out.print("Access elementis: ");
		a.access(2);
		
		a.search(30);
		a.search(5);
		
		a.delete(2);
		a.delete(5);
		
	}

}
