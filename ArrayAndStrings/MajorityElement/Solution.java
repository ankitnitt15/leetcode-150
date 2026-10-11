class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        if(len<3)
            return nums[0];
        Map<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;
        for(int i=0; i<len; i++){
            if(freq.containsKey(nums[i])){
                cnt = freq.get(nums[i]);
                cnt++;
                if(cnt > len/2)
                    return nums[i];
                freq.put(nums[i], cnt);
            }
            else{
                freq.put(nums[i], 1);
            }
        }
        return -1;
    }
}