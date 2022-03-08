package com.test;

import java.util.HashSet;

/**
 * @author
 * @version V1.0
 * @description 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * @date 2022/3/8 16:53
 */
public class Solution1 {
    public boolean isUnique(String astr) {
        // 遍历字符数组，并准备一个set
        char[] chars = astr.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        for (char c:chars){
            // 判断set是否包含这个字符，如果包含，直接返回false
            if (set.contains(c)) {
                return false;
            } else {
                // 如果不包含，则将该字符放入set里面
                set.add(c);
            }
        }
        // 遍历完成，返回true
        return true;
    }
}
