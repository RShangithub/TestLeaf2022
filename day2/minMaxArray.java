package week1.day2;

import java.util.Arrays;

public class minMaxArray {
	public static void main(String[] args) {
		int[] nums= {22,76,-45,878,-12,0,34,82};
		
		Arrays.sort(nums);
		int length = nums.length;
		System.out.println("Minimum Number is "+nums[0]);
		
		System.out.println("Maximum number is "+nums[length-1]);
	}

}
