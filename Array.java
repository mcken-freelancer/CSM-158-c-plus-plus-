public class Array {
    public static void main(String[] abra) {
        int[][] k = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10, }, { 11, 12, 13, 14, 15, } };
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                System.out.print(k[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
