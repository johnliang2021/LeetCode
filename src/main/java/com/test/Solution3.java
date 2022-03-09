package com.test;

/**
 * @author
 * @version V1.0
 * @description URL化
 * @date 2022/3/8 17:36
 */
public class Solution3 {
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        int index = S.length() - 1;
        for (int i = length - 1; i >=0 ; i--) {
            if (chars[i] == ' ') {
                chars[index--] = '0';
                chars[index--] = '2';
                chars[index--] = '%';
            } else {
                chars[index--] = chars[i];
            }
    }
        return new String(chars, index + 1, chars.length - (index + 1));
    }
}
