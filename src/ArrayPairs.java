public class ArrayPairs {
    public static void main(String[]args){
        int[]arrayOne = {1,7,6,5,9};
        int[]arrayTwo = {2,7,6,3,4};
        for(int i = 0; i<=4; i++){
            if(arrayOne[i]==arrayTwo[i]){
                System.out.println(arrayOne[i]+","+ arrayTwo[i]);
            }
        }
    }

}
