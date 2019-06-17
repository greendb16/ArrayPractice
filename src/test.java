import java.util.Scanner;
//does not work
public class test {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String[] strArray2 = new String[3];

        for (String word : strArray2) {
            System.out.println("Enter a new word"); // red, blue, yellow
            word = input.nextLine();
        }

        for (String word : strArray2) {
            System.out.println("The word is " + word);
        }

    }
}
