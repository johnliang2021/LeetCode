package com.test;

import java.util.Arrays;

/**
 * @author
 * @version V1.0
 * @description 判定是否互为字符重排
 * @date 2022/3/8 17:14
 */
class Solution2 {
    public boolean CheckPermutation(String s1, String s2) {
        // 利用数组工具类的sort方法分别排序，再转成字符串用equals比较是否相同
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return new String(chars1).equals(new String(chars2));
    }
}
