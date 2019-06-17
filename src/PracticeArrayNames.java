import java.util.Scanner;


public class PracticeArrayNames {
    public static void main(String[] args) {
        String[] myArray = new String[3];
        Scanner key = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter a name :");
            myArray[i] = key.nextLine();
        }
//
//
//        }
            //Does not work
//        for (String word : myArray) {
//            System.out.println("Enter a name :");
//            word = key.nextLine();

//        }

        for(String word: myArray){
                System.out.println(word);
            //works
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);



        }
    }
}

