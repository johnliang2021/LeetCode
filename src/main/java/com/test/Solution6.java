package com.test;

/**
 * @author
 * @version V1.0
 * @description 字符串压缩
 * @date 2022/3/9 10:37
 */
public class Solution6 {
    // 依次取出每个字符，比较该字符与后续字符，如果一样，则计数加1，直到不一样
    // 用StringBuilder进行拼接
    // 最后判断新的字符串和旧字符串的长度
    public String compressString(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char a = S.charAt(i);
            int count = 1;
            while(S.length() > ++i && a == S.charAt(i)) {
                count++;
            }
            i--;
            sb.append(a).append(count);
        }
        return sb.toString().length() >= S.length()? S: sb.toString();
    }
}
