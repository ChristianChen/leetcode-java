package cn.chenhaoming.leetcode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * https://leetcode.com/problems/maximum-swap/
 * <p>
 * 670. Maximum Swap
 * Medium
 * <p>
 * 531
 * <p>
 * 42
 * <p>
 * Favorite
 * <p>
 * Share
 * Given a non-negative integer, you could swap two digits at most once to get the maximum valued number. Return the maximum valued number you could get.
 * <p>
 * Example 1:
 * Input: 2736
 * Output: 7236
 * Explanation: Swap the number 2 and the number 7.
 * Example 2:
 * Input: 9973
 * Output: 9973
 * Explanation: No swap.
 * Note:
 * The given number is in the range [0, 108]
 */
public class MaximumSwapTest {


    @Test
    public void can_return_7236_with_2736_inputted() {
        assertThat(new MaximumSwap().maximumSwap(2736), is(7236));
    }

    @Test
    public void can_return_9973_with_9973_inputted() {
        assertThat(new MaximumSwap().maximumSwap(9973), is(9973));
    }

    @Test
    public void can_return_0_with_0_inputted() {
        assertThat(new MaximumSwap().maximumSwap(0), is(0));
    }

    @Test
    public void can_return_9913_with_1993_inputted() {
        assertThat(new MaximumSwap().maximumSwap(1993), is(9913));
    }
}
