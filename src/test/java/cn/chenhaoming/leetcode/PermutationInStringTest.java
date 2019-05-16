package cn.chenhaoming.leetcode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PermutationInStringTest {


    @Test
    public void can_return_true_when_s2_contains_s1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        assertThat(new PermutationInString().checkInclusion(s1, s2), is(true));
    }

    @Test
    public void can_return_true_with_longer_strings() {
        String s1 = "abc";
        String s2 = "dcba";
        assertThat(new PermutationInString().checkInclusion(s1, s2), is(true));
    }
}
