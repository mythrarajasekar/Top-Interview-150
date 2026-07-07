class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start<= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start ++;
            end--;
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna