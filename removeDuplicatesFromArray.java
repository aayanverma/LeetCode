
public class removeDuplicatesFromArray {
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int x = 1; x < nums.length; x++) {
            if (nums[x] != nums[i]) {
                i++;
                nums[i] = nums[x];
            }
        }
        
        return i + 1;
    }
}
