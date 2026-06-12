package com.CompanySpecificProblems;

public class DuplicatesSortedArray {
//	public int duplicates_sorted_array(int[] nums) {
//
//		int i = 0;
//
//		for (int j = 1; j < nums.length; j++) {
//			if (nums[j] != nums[i]) {
//				i++;
//				nums[i] = nums[j];
//			}
//		}
//
//		return i + 1;
//
//	}

	public static int removeDuplicates(int[] iArrNum) {

		if (iArrNum.length == 0) {
			return 0;
		}

		int kCount = 1;

		for (int iCount = 1; iCount < iArrNum.length; iCount++) {

			if (iArrNum[iCount] != iArrNum[kCount - 1]) {
				iArrNum[kCount] = iArrNum[iCount];
				kCount++;
			}
		}

		return kCount;
	}
}
