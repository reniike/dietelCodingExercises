package chapterSix;

public class Multiples {
    public static void main(String[] args) {

        System.out.println(isMultiple(10,3));

    }
    public static boolean isMultiple(int firstNumber , int secondNumber){
        if(firstNumber % secondNumber == 0){
            return true;
        }else{
            return false;
        }
    }

}
