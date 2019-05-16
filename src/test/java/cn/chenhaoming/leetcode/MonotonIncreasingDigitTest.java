package cn.chenhaoming.leetcode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MonotonIncreasingDigitTest {

    @Test
    public void can_return_increasing_digit_with_1234() {
        assertThat(new MonitonIncreasingDigit().monotoneIncreasingDigits(1234), is(1234));
    }

    @Test
    public void can_return_increasing_digit_with_33322() {
        assertThat(new MonitonIncreasingDigit().monotoneIncreasingDigits(33322), is(29999));
    }
}
