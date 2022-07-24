package com.bishtb.twopointers;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12};
		moveZeroes(nums);
		for(int i : nums)
			System.out.println(i);

	}

	public static void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        for (int i=0; i<nums.length; i++) {
            if(nums[i] != 0){
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        
        //fill rest with zero
        for (int i = lastNonZeroIndex; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}
