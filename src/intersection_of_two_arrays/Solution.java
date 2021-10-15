package intersection_of_two_arrays;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<>();
		Set<Integer> resultSet = new HashSet<>();

		for (int num : nums1) {
			set.add(num);
		}

		for (int num : nums2) {
			if (set.contains(num)) {
				resultSet.add(num);
			}
		}

		int[] result = resultSet.stream().mapToInt(Integer::intValue).toArray();

		return result;
	}
}
