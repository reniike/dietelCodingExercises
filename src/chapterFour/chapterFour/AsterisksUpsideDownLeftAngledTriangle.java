package chapterSix.arrays.chapterFour;

public class AsterisksUpsideDownLeftAngledTriangle {
    public static void main(String[] args) {
        int count;
        int space = 10;

        for(count = 1; count <= space ; count++){
            for (int j = 10; j <= space; j++){
                System.out.print(" ");
            }
            for (int k = count; k <= 10; k++) {
                System.out.print("*");
            }
            System.out.println( );
            space++;
        }
    }
}
