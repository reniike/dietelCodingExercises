package chapterSix.arrays.chapterFour;

public class AsterisksRightAngledTriangle {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <= 10; count++){
            for (int j = 1; j < count; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
