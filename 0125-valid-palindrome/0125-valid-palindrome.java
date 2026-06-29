class Solution {
    public boolean isPalindrome(String s) {
        String  st = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = st.length()-1;
        if (left >= right) return true;

        while(left <= right){
            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}