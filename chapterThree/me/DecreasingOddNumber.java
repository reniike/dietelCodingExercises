package chapterThree.me;

public class DecreasingOddNumber {
    public static void main(String[] args) {

        for(int i= 100 ; i >= 1 ; i-- ){
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}
