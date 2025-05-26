package com.nit.stringprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
	
	public static void addingNewElementsInArray(int [] arr,int newElement,int indexPosition) {
		
		int []newArr=new int[arr.length+1];
		
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		System.out.println(Arrays.toString(newArr));
		//not yet completed
		int temp1=arr[indexPosition];
		newArr[indexPosition]=newElement;
		for(int i=indexPosition+1;i<arr.length-1;i++) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp1;
		}
		System.out.println(Arrays.toString(newArr));
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {2,5,3,8,9};
		System.out.println("Enter New Element: ");
		int newElement=sc.nextInt();
		System.out.println("Enter which index position want to add: ");
		int indexPosition=sc.nextInt();
		addingNewElementsInArray(arr, newElement, indexPosition);
		sc.close();
	}
	

}

/*
Question.2)
-------------------
Write the java program for inserting new elements in the integer array at
specific index position. first you have to take integer Array and Store 
integer elements. after storing take one  new element and ask from the user
which index position you want to store new elements. After Storing print all
Array elements.
---------------------
input: int []arr={2,5,3,8,9}; int newElements=6,int indexpostion=2;
output: Array elemets after storing new elements are:[2,5,6,3,8,9];
 */