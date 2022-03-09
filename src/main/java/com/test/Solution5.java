package com.test;

/**
 * @author
 * @version V1.0
 * @description 一次编辑
 * @date 2022/3/9 9:39
 */
public class Solution5 {
    public boolean oneEditAway(String first, String second) {
        // 通过长度不同分情况判断
        int f = first.length();
        int s = second.length();
        // 如果长度差大于1，则直接false
        if (f - s > 1 || f -s < -1) {
            return false;
        }
        // 如果长度差等于1，则通过操作长的字符串后与短的字符串比较
        if (f -s == 1) {
            for (int i = 0; i < f; i++) {
               String newStr = first.substring(0,i) + first.substring(i + 1);
                if (newStr.equals(second)) {
                    return true;
                }
            }
        }
        if (f -s == -1) {
            for (int i = 0; i < s; i++) {
                String newStr = second.substring(0,i) + second.substring(i + 1);
                if (newStr.equals(first)) {
                    return true;
                }
            }
        }
        // 如果长度相同，则依次比较两个字符串每一个字符，用一个计数位计数不同位置，如果计数大于1则返回false
        if (f -s == 0) {
            int count = 0;
            for (int i = 0; i < f; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    count++;
                }
            }
            if (count <= 1) {
                return true;
            }
        }
        return false;
    }
}
