package com.app;

public class TwoDimensionArray {

	//create
	int arr[][];

	//Here constructor is take an argument
	public TwoDimensionArray(int noOfRows,int noOfColumns) {
		this.arr = new int[noOfRows][noOfColumns];
		for(int row=0;row<arr.length;row++) {
			for(int column=0;column<arr.length;column++) {
				//arr[row][column] = Integer.MIN_VALUE;
			}
		}
	}
	//Traverse
	public void traverseArray() {
		try {
			for(int row=0;row<arr.length;row++) {
				for(int column=0;column<arr.length;column++) {
					System.out.print(+arr[row][column] +" ");
				}
				System.out.println();
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//insert
	public void insertArray(int row,int column,int value) {
		try {
			if(arr[row][column] == 0) {
				arr[row][column] = value;
			}else {
				System.out.println("This cell is already occupied..");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	//Access element
	public void accessValus(int row,int column) {
		try {
			if(arr[row][column] != 0) {
				System.out.println("Access value: "+arr[row][column]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");	
		}
		System.out.println();
	}
	//searching a value
	public void searchArray(int value) {
		int temp[][] = new int[1][1];
		for(int row=0;row<arr.length;row++) {
			for(int column=0;column<arr.length;column++) {
				if(arr[row][column] == value) {
					temp[0][0] = value;
					System.out.println("Value is found");
				}
			}
		}
		if(temp[0][0] !=value) {
			System.out.println("Value is not found");
		}
		System.out.println();
	}
	//Delete
	public void deleteValue(int cellRow,int cellColumn) {
		if(arr[cellRow][cellColumn] !=0) {
			System.out.println("Value is deleted");
			arr[cellRow][cellColumn] = 0;
		}else {
			System.out.println("Can't delete, this cell is empty..");
		}
	}

}