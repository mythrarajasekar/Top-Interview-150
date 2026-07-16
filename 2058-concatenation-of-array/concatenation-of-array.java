class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] cat = new int[n*2];
        
        for(int i = 0;i<n;i++){
            cat[i] = nums[i];  
            cat[i+n] = nums[i];          
        }
       
        return cat;
    }
}