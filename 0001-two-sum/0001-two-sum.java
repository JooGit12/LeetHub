import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (numMap.containsKey(difference)) {
                return new int[]{numMap.get(difference), i};
            }

            numMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
