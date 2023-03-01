package chapterThree.me;

public class FolasLoop {
    public static void main(String[] args) {
        System.out.println("a");
        int count;
        int j;
        int space;

        for(count = 1; count <= 10 ; count++){
            for(j = 1 ; j <= count; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        System.out.println("\n  b");
        for(count = 10 ; count >= 1 ; count--){
            for (j = 1; j <= count ; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        System.out.println("\n c");

        space = 1;
        for (count= 10; count >= 1; count--){
            for (j = 1; j <= space; j++){
                System.out.print(j);
            }
            for (space = 0; space >= 10; space++){
                System.out.print(' ');
            }

            System.out.println(" ");
        }
    }
}
