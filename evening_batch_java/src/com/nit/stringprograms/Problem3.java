package com.nit.stringprograms;

public class Problem3 {
	public static void maxSumThreeElements(int[] arr) {
		
		int maxSum=arr[0]+arr[1]+arr[2];
		int index=0;
		
		for(int i=1;i+2<arr.length;i++) {
			
			if(arr[i]+arr[i+1]+arr[i+2]>maxSum) {
				maxSum=arr[i]+arr[i+1]+arr[i+2];
				index=i;
			}
		}
		System.out.println("Consecutive Elements are : ["+arr[index]+","+arr[index+1]+","+arr[index+2]+"]");
		System.out.println("maxsum between three consecutive index element "+maxSum);
		
	}
	public static void main(String[] args) {
		int[] arr = { 2, 4, 7, 8, 6, 9, 5, 3 };
		maxSumThreeElements(arr);
	}
}

/*
2).Question.
--------------
write the java program for searching the maximum sum between three consecutive index element of array .
for example: input  int []arr={2,4,7,8,6,9,5,3};
            output:-maxsum between three consecutive index element=23
                  : consecutive elements are:[8,6,9]
-----------------------------
Note: Take one static method return type will be void and take int[]arr parameter.
     inside that method print the requirement output.
 */

/*------not completed yet this  below code--------
 * //		for(int i=0;i<arr.length-1;i++) {
//			maxSum=arr[i]+arr[i+1]+arr[i+2];
//			System.out.println(arr[i]+arr[i+1]+arr[i+2]);
//		}
//		System.out.println(maxSum);
		
		for(int i=0;i<arr.length;i++) {

			for(int j=i+1;j<arr.length-1;j++) {
				int maxSum1=0;
				maxSum1=(arr[i]+arr[j]+arr[j+1]);
				if(maxSum<maxSum1) {
					maxSum=maxSum1;
					System.out.println(arr[i]+","+arr[j]+","+arr[j+1]);
					System.out.println(maxSum);
				}
			}
		}
 * 
 */