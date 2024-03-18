package Arrays;

public class RepeatingValues {
    public static void main(String[] args) {
        int[] list = {1, 1, 2, 2, 664, 32, 33, 33, 44, 55, 55, 44, 1, 45, 664, 32,};
        int[] duplicate = new int[list.length];

        int count = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!wasFound(duplicate, list[i])) {
                        duplicate[count++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int element : duplicate) {
            if (element != 0) {
                System.out.println(element);
            }
        }
    }

    static boolean wasFound(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
