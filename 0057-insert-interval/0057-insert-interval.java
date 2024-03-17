class Solution {
	public int[][] insert(int[][] intervals, int[] newInterval) {

		List<int[]> answer = new ArrayList<>();

		int intervalsLen = intervals.length;
		int newIntervalsIndex = 0;

		while (newIntervalsIndex < intervalsLen && intervals[newIntervalsIndex][1] < newInterval[0]) {
			answer.add(intervals[newIntervalsIndex]);
			newIntervalsIndex++;
		}

		testSolution57(answer);
		
		while (newIntervalsIndex < intervalsLen && intervals[newIntervalsIndex][0] <= newInterval[1]) {
			newInterval[0] = Math.min(newInterval[0], intervals[newIntervalsIndex][0]);
			newInterval[1] = Math.max(newInterval[1], intervals[newIntervalsIndex][1]);
			newIntervalsIndex++;
		}

		answer.add(newInterval);
		
		testSolution57(answer);

		while (newIntervalsIndex < intervalsLen) {
			answer.add(intervals[newIntervalsIndex]);
			newIntervalsIndex++;
		}

		testSolution57(answer);
		
		return answer.toArray(new int[answer.size()][2]);
	}

	public void testSolution57(List<int[]> list) {
		for (int[] arr : list) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("-----------------");
	}

	public static void main(String[] args) {
		Solution s = new Solution();

		int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
		int[] newInterval = { 4, 8 };

		int[][] result = s.insert(intervals, newInterval);
		System.out.println(Arrays.deepToString(result));
	}
}
