package ex_28052024.Collection;

public class Lab064 {

	public static void main(String[] args) {
		// TODO Two Sum Problem Statement
//		Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//				Input: nums = [2, 7, 11, 15], target = 9
//				Output: [0, 1]
		
		
		int [] nums = {2, 7, 11, 15};
		int target = 9;
		
//		for(int  item : nums)
//		{
//			System.out.println(nums.item);
//		}
		
		for(int i=0; i < nums.length; i++)
		{
			//System.out.println(nums[i]);
			
			if(nums[i]+nums[i+1]== target)
			{
				System.out.println(i);
			}
		}
		

		

	}

}
