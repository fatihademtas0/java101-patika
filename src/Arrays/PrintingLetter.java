package Arrays;

public class PrintingLetter {
    public static void main(String[] args) {
        String[][] letterA = new String[6][4];

        //PRİNTİNG **A**
        for (int i = 0; i < letterA.length; i++) {
            for (int j = 0; j < letterA[i].length; j++) {
                if (i == 0 || i == 2) {
                    letterA[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letterA[i][j] = " * ";
                } else {
                    letterA[i][j] = "   ";
                }
            }
        }
        for (String[] row : letterA) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("   ");

        //PRİNTİNG **H**
        String[][] letterH = new String[7][5];

        for (int i = 0; i < letterH.length; i++) {
            for (int j = 0; j < letterH[i].length; j++) {
                if (j == 0 || j == 4) {
                    letterH[i][j] = " * ";
                } else if (i == 3) {
                    letterH[i][j] = " * ";
                } else {
                    letterH[i][j] = "   ";
                }
            }
        }
        for (String[] row : letterH) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("   ");
        //PRİNTİNG **Z**
        String[][] letterZ = new String[7][7];

        for (int i = 0; i < letterZ.length; i++) {
            for (int j = 0; j < letterZ[i].length; j++) {
                if (i == 0 || i == 6) {
                    letterZ[i][j] = " * ";
                } else if (i == 1 && j == 5) {
                    letterZ[i][j] = " * ";
                } else if (i == 2 && j == 4) {
                    letterZ[i][j] = " * ";
                } else if (i == 3 && j == 3) {
                    letterZ[i][j] = " * ";
                } else if (i == 4 && j == 2) {
                    letterZ[i][j] = " * ";
                } else if (i == 5 && j == 1) {
                    letterZ[i][j] = " * ";
                } else {
                    letterZ[i][j] = "   ";
                }
            }
        }
        for (String[] row : letterZ) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
