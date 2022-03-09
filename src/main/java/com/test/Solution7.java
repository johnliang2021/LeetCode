package com.test;

/**
 * @author
 * @version V1.0
 * @description 旋转矩阵
 * @date 2022/3/9 10:52
 */
public class Solution7 {
    public void rotate(int[][] matrix) {
       int len = matrix.length;
        // 先对矩阵以左斜对角为轴进行镜像
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] =  matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 再对矩阵以中心数轴进行镜像
        int mid = len >> 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < mid; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len - 1 - j];
                matrix[i][len - 1 - j] = temp;
            }
        }
    }
}
