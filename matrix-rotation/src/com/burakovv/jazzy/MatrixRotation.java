package com.burakovv.jazzy;

public class MatrixRotation {
    private MatrixRotation() {}

    public static void rotateClockwise(int[][] matrix, int n) {
        for (int x = 0; x < (n + 1) / 2; x++) {
            for (int y = 0; y < n / 2; y++) {
                int rx = x;
                int ry = y;

                int last = matrix[rx][ry];
                for (int i = 0; i < 4; i++) {
                    int b = rx;
                    rx = n - ry - 1;
                    ry = b;

                    int cur = matrix[rx][ry];
                    matrix[rx][ry] = last;
                    last = cur;
                }
            }
        }
    }
}
