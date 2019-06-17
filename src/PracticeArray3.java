import java.util.Scanner;


public class PracticeArray3 {
    public static void main(String[] args) {
        int[] myInt = new int[10];
        Scanner key = new Scanner(System.in);
        int sum = 0;
        for (int i : myInt) {
            System.out.println("Enter a number :");
            myInt[i] = key.nextInt();
            sum += myInt[i];
        }
        int average = sum / myInt.length;
        System.out.println("The sum is:\t" + sum);
        System.out.println("The average is:\t" + average);
    }
}



