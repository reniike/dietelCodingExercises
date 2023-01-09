package chapterSix.arrays.chapterFour;

public class DiamondAsteriskClass {
    public static void main(String[] args) {

        int blank = 4;
        int count;
        for(count = 1; count < 10 ; count+=2 ){
            for (int j = 1; j <= blank; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= count; j++){
                System.out.print("*");
            }
            System.out.println();
            blank--;
        }
        blank = 1;
        for (count = 7; count > 0; count-=2){
            for (int j = 0; j < blank; j++){
                System.out.print(" ");
            }
            for (int j=count; j > 0 ; j--){
                System.out.print("*");
            }
            System.out.println();
            blank++;
        }
    }
}
