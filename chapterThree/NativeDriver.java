package chapterThree;

import java.util.Scanner;

public class NativeDriver {
    public static void main(String[] args) {
        Native renike = new Native();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = input.nextLine();
        renike.setName(userName);
        System.out.println(renike.getName());

        System.out.println("Enter your age: ");
        int userAge = input.nextInt();
        renike.setAge(userAge);
        System.out.println(renike.getAge());
        input.nextLine();

        System.out.println("Enter your phone number:");
        String userPhoneNumber = input.nextLine();
        renike.setPhoneNumber(userPhoneNumber);
        System.out.println(renike.getPhoneNumber());
    }
}
