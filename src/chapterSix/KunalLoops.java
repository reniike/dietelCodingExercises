package chapterSix;

public class KunalLoops {
    public static void main(String[] args) {
        upsideDownRightAngledTriangle(6);
    }
    static void upsideDownRightAngledTriangle(int n){
        for (int row = 1; row <= n; row++) {
            for (int colomns = 1; colomns <= n - row; colomns++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
