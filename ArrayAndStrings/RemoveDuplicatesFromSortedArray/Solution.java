class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return 1;
        }
        int i=0, j=1;
        while(j<len){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}