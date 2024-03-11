package Arrays;

public class Start {

    static int[] reversedArr(int[] arr){ // to reverse an array
        int[] reverseArr = new int[arr.length];
        for (int i = 0, j = arr.length -1 ; i < arr.length ; i++,j--) {
            reverseArr[i] = arr[j]; // last element of the given array = first element of the new array
        }
        return reverseArr;
    }
    static void printArr(int[] arr){ // prints the given array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void printArr2(int[] arr){ // another way of printing array elements
        for (int element : arr ){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) { // creating an array without entering elements
            list[i] = (i*10)+10;
            System.out.println(list[i]);
        }

        int[] list2 = {0,5,10,15,20,25,30,35,40};

        printArr(list2);

        printArr2(list2);

        System.out.println("-------------");

        printArr(reversedArr(list2));

    }
}
