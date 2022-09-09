package week1.day2;

import java.util.Arrays;

public class findDupsinArray {
	public static void main(String[] args) {
		int[] nums= {88,77,66,88,33,44,33,77,11,99,44};
		
		Arrays.sort(nums);
		
		for (int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				System.out.println("Duplicates are :"+nums[i]);
			}
		}
	}

}
