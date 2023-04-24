package Neso;

public class Exercise4 {
    public static void main(String[] args) {
        int[] userInput = {2,3,4,4,4,4,2,1,3};
        int max = userInput[0] ;
        int min = userInput[0];

//    private static int getMax(int[] userInput , int max, int min) {
        for (int index = 0; index < userInput.length; index++) {
            if (userInput[index] > max) {
                max = userInput[index];
            }
            if (userInput[index] < min) {
                min = userInput[index];
            }
        }
        System.out.printf("Max = %s%n" , max);
        System.out.printf("Min = %s%n" , min);
    }
}
