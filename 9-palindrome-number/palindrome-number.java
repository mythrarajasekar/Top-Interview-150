class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int og = x;
        int rev = 0;

        while(x>0){
            int dig = x % 10;
            rev = rev *10 + dig;
            x = x/10;
        }

        return (og == rev);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna