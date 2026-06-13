package com.CompanySpecificProblems;

public class Problem11MostWater {

	static class Solution {
		public int maxArea(int[] height) {

			int left = 0;
			int right = height.length - 1;

			int maxWater = 0;

			while (left < right) {

				int width = right - left;

				int minHeight;

				if (height[left] < height[right]) {
					minHeight = height[left];
				} else {
					minHeight = height[right];
				}

				int area = width * minHeight;

				if (area > maxWater) {
					maxWater = area;
				}

				if (height[left] < height[right]) {
					left++;
				} else {
					right--;
				}
			}

			return maxWater;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 8, 8, 6, 2, 5, 8, 4, 3, 7 };

		Solution s = new Solution();
		System.out.println(s.maxArea(arr));
	}
}