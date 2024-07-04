class Solution {
    public int maximumCount(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int pos = -1;
        int neg = -1;

        while(low <= high){
            int mid = low+(high-low)/2;

            if(nums[mid] > 0){
                pos = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        
        if (pos != -1){
            pos = nums.length-pos;
        }else {
            pos = 0;
        }

        low = 0;
        high = nums.length-1;

        while(low <= high){
            int mid = low+(high-low)/2;

            if(nums[mid] < 0){
                low = mid+1;
                neg = mid;
            }else{
                high = mid-1;
            }
        }
        return Math.max(pos,neg+1);
    }
}
