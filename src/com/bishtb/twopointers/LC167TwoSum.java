package com.bishtb.twopointers;

import java.util.ArrayList;

public class LC167TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		int[] nums = {2, 7, 11, 15};
		list.add(nums);
		int[] num1 = {2,3,4};
		list.add(num1);
		int[] num2 = {-1, 0};
		list.add(num2);
		
		int[] target = {9, 6, -1};
		int i = 0;
		for(int[] arr : list) {
			int[] result = twoSum(arr,target[i]);
			System.out.println(result[0]+","+ result[1]);
			i++;
		}
	}

	 public static int[] twoSum(int[] numbers, int target) {
	        int i =0, j = numbers.length - 1;
	        while( i < j){
	            if(numbers[i] + numbers[j] == target){
	                return new int[]{i+1, j+1};
	            }
	            else if(numbers[i] + numbers[j] > target)
	                j--;
	            else
	                i++;     
	        }
	        return new int[]{};
	    }
}
