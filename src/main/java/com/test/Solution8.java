package com.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author
 * @version V1.0
 * @description  零矩阵
 * @date 2022/3/9 11:21
 */
public class Solution8 {
    public void setZeroes(int[][] matrix) {
        // 遍历整个数组，并准备两个set，分别代表行集合和列集合,如果元素为0，则将该元素所在行列分别加入到列表中
        Set<Integer> row = new HashSet<Integer>();
        Set<Integer> columns = new HashSet<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    columns.add(j);
                }
            }
        }
        for (int index:row) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[index][i] = 0;
            }
        }
        for (int index:columns) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][index] = 0;
            }
        }
    }
}
