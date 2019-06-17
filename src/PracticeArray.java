import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class PracticeArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] myInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : myInt) {
            sum += i;

        }
        System.out.println("sum = " + sum);
        System.out.println(myInt.length);


    }
}