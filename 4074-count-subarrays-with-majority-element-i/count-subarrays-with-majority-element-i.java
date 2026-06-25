class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int targetCount = 0;

            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    targetCount++;
                }

                int len = j - i + 1;

                if (targetCount > len / 2) {
                    count++;
                }
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna