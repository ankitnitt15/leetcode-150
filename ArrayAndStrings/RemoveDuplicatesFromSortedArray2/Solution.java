class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len<=2)
            return len;
        int i=2, j=2;
        while(i<len){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        return j;
    }
}