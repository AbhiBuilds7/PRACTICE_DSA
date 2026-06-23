public class Single {
    public static int singleNonDuplicate(int[] nums){
        int left = 0, right = nums.length-1;

        while (left<right){
            int mid = (right-left)/2 + left;

            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid]!=nums[mid+1]){
                right = mid-1;
            }else {
                left = mid+2;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
}
