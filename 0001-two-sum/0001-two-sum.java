class Solution {
	public int[] twoSum(int[] nums, int target) {

		int[][] sortedNums = new int[nums.length][2];

		for (int i = 0; i < nums.length; i++) {
			sortedNums[i][0] = nums[i];
			sortedNums[i][1] = i;
		}

		Arrays.sort(sortedNums, (a, b) -> a[0] - b[0]);

		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int sum = sortedNums[left][0] + sortedNums[right][0];
			if (target > sum) {
				left++;
			} else if (target < sum) {
				right--;
			} else {
				return new int[] { sortedNums[left][1], sortedNums[right][1] };
			}
		}

		return new int[] {};
	}
}
