class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = "";
        int i = 0;
        int length = strs.length;

        while (i < strs[0].length()) {
            if (strs[0].charAt(i) == strs[length - 1].charAt(i))
                s += strs[0].charAt(i);
            else
                break;
            i++;
        }

        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna