package chapterSix.arrays.chapterFour;

public class AsterisksUpsideDownRightAngledTriangle {
    public static void main(String[] args) {
        int count;
        for(count = 10; count >= 1 ; count--){
            for (int j = 1; j < count ; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}

