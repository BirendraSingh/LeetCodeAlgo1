package com.bishtb.twopointers;

public class L977SquareRootSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-10, -7, -4, -1, 4 ,5 ,6, 8, 9, 10};
		int[] res = sortedSquares(nums);
		for(int i: res) {
			System.out.println(i);
		}
	}

	public static int[] sortedSquares(int[] nums) {
		// base case
		if(nums==null || nums.length == 0) {
			return nums;
		}
        int n = nums.length;
        int i = 0;
        int j = n -1;
        int[] res = new int[n];
        for(int k=n-1; k>=0; k--) {
        	if(Math.abs(nums[i]) >= Math.abs(nums[j])) {
        		res[k] = nums[i] * nums[i];
        		i++;
        	} else {
        		res[k] = nums[j] * nums[j];
        		j--;
        	}
        }
        return res;
    }
}

