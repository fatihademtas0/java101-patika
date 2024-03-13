package Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        int[][] list = new int[3][3];

        list[0][0] = 25;
        list[0][1] = 30;

        int[][] list2 = new int[3][3];
/*
        list2[0][0] = 1;
        list2[0][1] = 1;
        list2[0][2] = 1;
        list2[1][0] = 1;
        list2[1][1] = 1;
        list2[1][2] = 1;
        list2[2][0] = 1;
        list2[2][1] = 1;
        list2[2][2] = 4;
 */
        int number = 1;

        System.out.println(list2.length); // prints the row number
        System.out.println(list2[0].length); // prints the column number

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2[i][j] = number++;
                System.out.print(list2[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
