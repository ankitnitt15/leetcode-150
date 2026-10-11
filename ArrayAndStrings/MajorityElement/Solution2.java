//Moore's algorithm
class Solution2 {
    public int majorityElement(int[] arr) {
        int len = arr.length;
        if(len<=2)
            return arr[0];
        int curr_elem = arr[0], count = 1, j=1;
        while(j<len){
            if(arr[j] == curr_elem){
                count++;
                j++;
            }
            else{
                count--;
                if(count==0){
                    curr_elem = arr[j];
                    count++;
                }
                j++;
            }
        }
        return curr_elem;
    }
}