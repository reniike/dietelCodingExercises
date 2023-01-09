package chapterSix.arrays.chapterFour;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        System.out.printf("%15s%15s%15s%n","Side 1" ,"Side 2","Side 3");

        int side3;
        int side2;
        int side1;

        for(side3 = 1 ; side3 <= 500 ; side3++){
            for (side2 = 1; side2 <= 500 ; side2++){
                for (side1 = 1; side1 <= 500 ; side1++){
                    if (side1 * side1 + side2 * side2 == side3 * side3){
                        System.out.printf("%15s%15s%15s\n", side1, side2, side3 );
                        //System.out.println();
                    }
                }
            }
        }
    }
}
