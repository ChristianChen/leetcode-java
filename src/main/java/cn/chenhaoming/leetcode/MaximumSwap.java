package cn.chenhaoming.leetcode;

import static java.lang.Integer.parseInt;

public class MaximumSwap {
    public int maximumSwap(int i) {
        if (i < 10) return i;
        char[] chars = Integer.toString(i).toCharArray();
        int p1 = -1;

        for (int j = 0; j < chars.length - 1; ++j) {
            if (chars[j] < chars[j + 1]) {
                p1 = j;
                break;
            }
        }

        if (p1 == -1) return i;
        int p2 = p1 + 1;

        for (int j = p1 + 1; j < chars.length; ++j)
            if (chars[j] >= chars[p2]) p2 = j;


        while (p1 > 0 && chars[p1 - 1] < chars[p2])
            p1--;

        char temp = chars[p1];
        chars[p1] = chars[p2];
        chars[p2] = temp;
        return parseInt(new String(chars));
    }
}
