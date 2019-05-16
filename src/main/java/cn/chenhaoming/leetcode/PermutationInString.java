package cn.chenhaoming.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/permutation-in-string/
 *
 * 567. Permutation in String
 * Medium
 * <p>
 * 608
 * <p>
 * 34
 * <p>
 * Favorite
 * <p>
 * Share
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
 * In other words, one of the first string's permutations is the substring of the second string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s1 = "ab" s2 = "eidbaooo"
 * Output: True
 * Explanation: s2 contains one permutation of s1 ("ba").
 * Example 2:
 * <p>
 * Input:s1= "ab" s2 = "eidboaoo"
 * Output: False
 * <p>
 * <p>
 * Note:
 * <p>
 * The input strings only contain lower case letters.
 * The length of both given strings is in range [1, 10,000].
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = buildCharMap(s1, 0, s1.length());

        int maxIndex = s2.length() - s1.length();
        for (int i = 0; i <= maxIndex; ++i) {
            Map<Character, Integer> map2 = buildCharMap(s2, i, i + s1.length());
            if (map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }

    private Map<Character, Integer> buildCharMap(String str, int startIndex, int endIndex) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = startIndex; i < endIndex; ++i) {
            char tempChar = str.charAt(i);
            Integer tempNum = map.get(tempChar);
            tempNum = tempNum == null ? 1 : tempNum + 1;
            map.put(tempChar, tempNum);
        }
        return map;
    }
}
