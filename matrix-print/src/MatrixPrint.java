public class MatrixPrint {

    public static void main(String[] args) {
        StringBuilder line = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int[][] matrixA;
        int n = 5;
        matrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = 1 + i * n + j;
                if (i == j) {
                    line.append(String.format("%3s", "*"));
                } else if (i == n - 1 - j) {
                    line.append(String.format("%3s", "*"));
                } else {
                    line.append(String.format("%3d", matrixA[i][j]));
                }
            }
            line.deleteCharAt(0).append(' ');
            result.append(line.toString()).append('\n');
            line = new StringBuilder();
        }
        System.out.print(result);
    }
}
