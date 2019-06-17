

public class ArrayReplace {
    public static void main(String[]args){
        String[]myStrings = {"w", "t", "y", "h", "k"};
         for(int i=0; i<myStrings.length; i++){
             if(myStrings[i].equals("t")){
                 myStrings[i]=("hello");


             }
             System.out.println(myStrings[i]);
         }
    }
}
