package arrays_and_strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ++counter;
            }
        }

        matrix[0][3] = 0;
        matrix[1][1] = 0;

        Set<Integer> rowsWithZeros = new HashSet<>();
        Set<Integer> colsWithZeros = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsWithZeros.add(i);
                    colsWithZeros.add(j);
                }
            }
        }

        for (Integer i: rowsWithZeros
             ) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }

        for (Integer i: colsWithZeros
        ) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = 0;
            }
        }

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
