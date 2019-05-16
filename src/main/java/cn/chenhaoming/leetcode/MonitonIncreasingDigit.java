package cn.chenhaoming.leetcode;

import static java.lang.Integer.parseInt;

/**
 * https://leetcode.com/problems/monotone-increasing-digits/
 * <p>
 * 738. Monotone Increasing Digits
 * Medium
 * <p>
 * 235
 * <p>
 * 41
 * <p>
 * Favorite
 * <p>
 * Share
 * Given a non-negative integer N, find the largest number that is less than or equal to N with monotone increasing digits.
 * <p>
 * (Recall that an integer has monotone increasing digits if and only if each pair of adjacent digits x and y satisfy x <= y.)
 * <p>
 * Example 1:
 * <p>
 * Input: N = 10
 * Output: 9
 * Example 2:
 * <p>
 * Input: N = 1234
 * Output: 1234
 * Example 3:
 * <p>
 * Input: N = 332
 * Output: 299
 * Note: N is an integer in the range [0, 10^9].
 */
public class MonitonIncreasingDigit {

    public int monotoneIncreasingDigits(int arg) {
        char[] str = Integer.toString(arg).toCharArray();
        for (int i = str.length - 1; i > 0; --i) {
            if (parseInt("" + str[i - 1]) > parseInt("" + str[i])) {
                str[i - 1]--;
                for (int j = str.length - 1; j >= i; --j) {
                    str[j] = '9';
                }
            }
        }

        return Integer.parseInt(new String(str));
    }
}
