class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int curr = 0;
        for(int i =0;i<nums.length;i++){
            curr += nums[i];
            if (curr > maxi){
                maxi = curr;
            }

            if(curr<0){
                curr=0;
            }
        }
        return maxi;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna