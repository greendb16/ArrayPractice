import java.util.Scanner;

public class PracticeArray2 {
    public static void main(String[]args){
    int[]myInt =new int[10];
    Scanner key = new Scanner(System.in);
    int sum =0;
        for(int i : myInt){
            System.out.println("Enter a number :");
        myInt[i] = key.nextInt();
        sum += myInt[i];
    }
        System.out.println(sum);
}}

