class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        int pointer = 0;

        while(pointer<nums.length){
            if(nums[pointer] == 1){
                count++;
                max = Math.max(count,max);
                pointer++;
            }else{
                count = 0;
                pointer++;
            }
        }
        return max;
    }
}