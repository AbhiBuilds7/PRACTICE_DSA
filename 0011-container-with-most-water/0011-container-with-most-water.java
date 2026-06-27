class Solution {
    public int maxArea(int[] arr) {
        int max = 0;
        int left = 0;
        int right = arr.length-1;
        
        while(left < right){
            int min = Math.min(arr[left],arr[right]);

            int currentMax = (right - left) * min;
            max = Math.max(currentMax,max);
            if(arr[left] > arr[right]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
}