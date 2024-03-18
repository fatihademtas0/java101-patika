package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] list = {5,10,6,10,6,5,10,6,6};
        Arrays.sort(list);

        int count = 1;

        for (int i = 0; i <list.length-1 ; i++) {
            if(list[i] == list[i+1]){
                count++;
            }else{
                System.out.println(list[i]+" has repated "+count+" times.");
                count = 1;
            }
        }
        System.out.println(list[list.length-1]+" has repated "+count+" times.");
    }
}
