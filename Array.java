public class Array {

    public int[][] getRowMajorSquare(int x) {
        int[][] result = new int[x][x];
        int num = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                result[i][j] = num++;
            }
        }
        return result;
    }

    public int[][] getColumnMajorSquare(int x) {
        int[][] result = new int[x][x];
        int num = 1;
        for (int j = 0; j < x; j++) {
            for (int i = 0; i < x; i++) {
                result[i][j] = num++;
            }
        }
        return result;
    }

    public int[][] getRowMajorRectangle(int row, int column) {
        int[][] result = new int[row][column];
        int num = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = num++;
            }
        }
        return result;
    }

    public int[][] getColumnMajorRectangle(int column, int row) {
        int[][] result = new int[row][column];
        int num = 1;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                result[i][j] = num++;
            }
        }
        return result;
    }

    public void printDouble(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(String.format("%2d ", a[i][j]));
            }
            System.out.println();
        }
    }
}