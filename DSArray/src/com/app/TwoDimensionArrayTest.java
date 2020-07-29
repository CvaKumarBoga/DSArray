package com.app;

public class TwoDimensionArrayTest {
	public static void main(String[] args) {
		TwoDimensionArray twoD = new TwoDimensionArray(5, 5);
		
		twoD.traverseArray();
		
		twoD.insertArray(0, 0, 9);
		twoD.insertArray(1, 2, 7);
		twoD.traverseArray();
		
		twoD.accessValus(1, 2);
		twoD.traverseArray();
		
		twoD.searchArray(7);
		twoD.searchArray(10);
		
		twoD.deleteValue(1, 2);
		twoD.traverseArray();
		twoD.deleteValue(1, 1);
	}

}
