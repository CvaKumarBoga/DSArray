package com.app;

public class OneDimensionArray {

	/*
	 * Time Complexity = O(1) Space Complexity = O(n)
	 */	
	//create an array
	int arr[];
	public OneDimensionArray(int arrsize) {
		arr = new int[arrsize];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.MIN_VALUE; // Compiler inserted minimum value(-2^31) instead of zero
		}
	}
	//insert
	/*
	 * Time Complexity = O(1) Space Complexity = O(1)
	 */	
	public void insert(int location,int value) {
		try {
			if(arr[location] == Integer.MIN_VALUE ) {
				arr[location] = value; //arr[0] = 1;
				System.out.println("value is inserted in index "+arr[location]);
			}
			else {
				System.out.println("this cell value is already exist...");
			}

		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Out of index..");
			a.printStackTrace();

		}
	}
	/*
	 * Time Complexity = O(n) Space Complexity = O(1)
	 */	
	//traversing 
	public void traversing() {
		try {
			for(int i=0;i<arr.length;i++) {
				System.out.print(+arr[i] +" ");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No longer available...");
		}
	}
	/*
	 * Time Complexity = O(1) Space Complexity = O(1)
	 */	
	//Access element
	public void access(int cell) {
		if(arr[cell]!=Integer.MIN_VALUE) {
			System.out.println(+arr[cell]);
		}else {
			System.out.println(Integer.MIN_VALUE);
		}
	}
	/*
	 * Time Complexity = O(n) Space Complexity = O(1)
	 */	
	//Search element
	public void search(int value) {
		int temp[] = new int[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == value) {
				temp[0] = value;
				System.out.println("value is found");
			}
		}
		if(temp[0] != value) {
			System.out.println("value is Not found");
		}
	}
	/*
	 * Time Complexity = O(1) Space Complexity = O(1)
	 */	
	//delete
	public void delete(int cell) {
		if(arr[cell]!=Integer.MIN_VALUE) {
			System.out.println(arr[cell]+" value is deleted");
			arr[cell] = Integer.MIN_VALUE;
		}
		else {
			System.out.println("This cell is empty...");
		}
	}
	
}
