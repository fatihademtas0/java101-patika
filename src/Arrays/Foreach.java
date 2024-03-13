package Arrays;

public class Foreach {
    public static void main(String[] args) {
        int[] list = new int[5];

        int number = 1;

        for (int i = 0; i <list.length ; i++) {
            number*=10;
            list[i] = number;
            System.out.println(list[i]);
        }



        for (int element : list) {
            number *= 10;
            element = number;
            System.out.println(element);
        }

        int[][] list2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : list2) { // prints rows at 0 index
            System.out.println(row[0]);
        }

        for (int[] row : list2) {
            for (int col : row) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }


    }
}
