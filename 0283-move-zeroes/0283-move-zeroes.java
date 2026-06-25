import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = reverse(nums, n);

        for (int i = n-count; i<n; i++) {
            nums[i] = 0;
        }
    }

    public static int reverse(int[] nums, int n) {
        int index = 0;   
        int count = 0;   

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i]; 
            } else {
                count++;
            }
        }
        return count;
    }
}
