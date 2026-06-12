package com.CompanySpecificProblems;

import java.util.Arrays;

//
//public class Problem14LongestPrefix {
//	class Solution {
//		public String longestCommonPrefix(String[] strs) {
//
//			if (strs == null || strs.length == 0) {
//				return "";
//			}
//
//			String prefix = strs[0];
//
//			for (int i = 1; i < strs.length; i++) {
//
//				while (!strs[i].startsWith(prefix)) {
//					prefix = prefix.substring(0, prefix.length() - 1);
//
//					if (prefix.isEmpty()) {
//						return "";
//					}
//				}
//			}
//
//			return prefix;
//		}
//	}//
//}

class Solution {

	public String longestCommonPrefix(String[] strs) {

		Arrays.sort(strs);

		String first = strs[0];
		String last = strs[strs.length - 1];

		int i = 0;

		while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
			i++;
		}

		return first.substring(0, i);
	}
}
