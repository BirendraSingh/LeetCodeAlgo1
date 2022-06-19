package com.bishtb.twopointers;

/**
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 * 
 * @author biren
 *
 */
public class L189RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {1,2,3,4,5,6,7};
		rotate(nums, 3);
		for(int i : nums) {
			System.out.println(i);
		}
		
	}

	public static void rotate(int[] nums, int k) {
		// base case
		if (nums == null || nums.length < 2)
			return;
		int n = nums.length;
		// k should be less than n
		k %= n;

		// first revers the entire array
		reverse(nums, 0, n - 1);
		// reverse from initial poistion to k -1 poisiton only
		reverse(nums, 0, k - 1);
		// finally revers the last half from k to end of the array
		reverse(nums, k, n - 1);
	}

	private static void reverse(int[] nums, int i, int j) {
		while (i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}
}
