
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int b = i + 1; b < nums.length; b++) {
                if(nums[b] == target - nums[i]) {
                    return new int[] { i, b };
                }
            }
        }
        return null;
    }
}
