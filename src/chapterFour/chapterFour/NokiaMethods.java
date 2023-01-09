package chapterSix.arrays.chapterFour;

import java.util.Scanner;

public class NokiaMethods{
    private static Scanner input = new Scanner(System.in);
    private static int userInput;

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("""
                LIST OF MENU FUNCTIONS:
                1.Phonebook
                2.Messages
                3.Chat
                4.Call Register
                5.Tones
                6.Settings
                7.Call Divert
                8.Games
                9.Calculator
                10.Reminder
                11.Clock
                12.Profiles
                13.SIM Services
                14.Exit
                """);

        System.out.println("Select any number between 1 and 13 to see their sub options or select 14 to exit: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                phoneBook();
                break;
            case 2:
                messages();
                break;
            case 3:
                chat();
                break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                settings();
                break;
            case 7:
                callDivert();
                break;
            case 8:
                games();
                break;
            case 9:
                calculator();
                break;
            case 10:
                reminder();
                break;
            case 11:
                clock();
                break;
            case 12:
                profiles();
                break;
            case 13:
                simServices();
                break;
            case 14:
                break;
        }
    }

    private static void phoneBook() {
        System.out.println("""
                1.Search
                2.Service Nos
                3.Add name
                4.Erase
                5.Edit
                6.Assign tone
                7.Send b card
                8.Option
                9.Speed dials
                10.Voice tags
                11.Back
                """);
        System.out.println("Select option 8 to see sub options: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 8:
                phonebookOption();
                break;
            case 11:
                menu();
                break;
            default:
                System.out.println("Invalid, enter a valid option: ");
                phoneBook();
        }
    }

    private static void phonebookOption() {
        System.out.println("""
                1.Type of view
                2.Memory status
                3.Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Type of view");
                nothingToSeeHereYet();
                phonebookOption();
                break;
            case 2:
                System.out.println("Memory status");
                nothingToSeeHereYet();
                phonebookOption();
                break;
            case 3:
                phoneBook();
                break;
            default:
                System.out.println("Enter a valid number");
                phonebookOption();
                break;
        }
    }

    private static void messages() {
        System.out.println("""
                1.Write messages
                2.Inbox
                3.Outbox
                4.Picture messages
                5.Templates
                6.Smileys
                7.Message settings
                8.Info services
                9.Voice mailbox number
                10.Service command editor
                """);
        System.out.println("Select option 7 to see sub options: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 7:
                messagesOption7();
                break;
            default:
                System.out.println("Invalid, please enter a valid number: ");
                messages();
                break;
        }

    }

    private static void messagesOption7() {
        System.out.println("""
                1.Set 1
                2.Common 3
                3.Back
                """);
        System.out.println("Select either 1 or 2 to see sub options or select 3 to go back to previous menu: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("""
                        1.Message centre number
                        2.Messages sent as
                        3.Message validity
                        4.Back
                        """);
                userInput = input.nextInt();
                if (userInput == 4) {
                    messagesOption7();
                }
                break;
            case 2:
                System.out.println("""
                        1.Delivery reports
                        2.Reply via same centre
                        3.Character support
                        4.Info services
                        5.Voice mailbox number
                        6.Service command editor
                        7.Back
                        """);
                userInput = input.nextInt();
                if (userInput == 7) {
                    messagesOption7();
                }else if( userInput < 0 ){
                    System.out.println("Invalid, enter a valid number: ");
                    messagesOption7();
                }
                break;
            case 3:
                messages();
                break;
            default:
                System.out.println("Enter a valid number: ");
                messagesOption7();
                break;
        }
    }

    private static void chat() {
        System.out.println("Chat");
    }

    private static void callRegister() {
        System.out.println("""
                1.Missed calls
                2.Received call
                3.Dialed number
                4.Erase recent call lists
                5.Show call duration
                6.Show call costs
                7.Call cost settings
                8.Prepaid credit
                """);
        System.out.println("Select option 5, 6 or 7 to see their sub options: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 5:
                callRegisterOption5();
                break;
            case 6:
                callRegisterOption6();
                break;
            case 7:
                callRegisterOption7();
                break;
        }
    }

    private static void callRegisterOption5() {
        System.out.println("""
                1.Last call duration
                2.All calls' duration
                3.Received calls' duration
                4.Dialled calls' duration
                5.Clear timers
                6.Back
                """);
        userInput = input.nextInt();
        if (userInput == 6) {
            callRegister();
        }
    }

    private static void callRegisterOption6() {
        System.out.println("""
                1.Last call cost
                2.All calls' cost
                3.Clear counters
                4.Back
                                      
                """);
        userInput = input.nextInt();
        if (userInput == 4) {
            callRegister();
        }
    }

    private static void callRegisterOption7() {
        System.out.println("""
                1.Call cost limit
                2.Show costs in
                3.Back
                """);
        userInput = input.nextInt();
        if (userInput == 3) {
            callRegister();
        }
    }

    private static void tones() {
        System.out.println("""
                1.Ringing tone
                2.Ringing volume
                3.Incoming call alert
                4.Composer
                5.Message alert tones
                6.Keypad tones
                7.Warning and game tones
                8.Vibrating alert
                9.Screen saver
                10.Back
                """);
        switch (userInput) {
            case 10:
                menu();
                break;
        }
    }

    private static void settings() {
        System.out.println("""
                1.Call settings
                2.Phone settings
                3.Security settings
                4.Restore factory settings
                5.Back
                """);
        System.out.println("Select option 1, 2, 3 or 4 to see their sub options: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                settingsOption1();
                break;
            case 2:
                settingsOption2();
                break;
            case 3:
                settingsOption3();
                break;
            case 4:
                System.out.println("Restore factory settings");
            case 5:
                menu();
        }
    }

    private static void settingsOption1() {
        //switch (userInput){
        //case 1:
        System.out.println("""
                1.Automatic redial
                2.Speed dialling
                3.Call waiting options
                4.Own number sending
                5.Phone line in use
                6.Automatic answer
                7.Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 7:
                settings();
                break;
        }
    }

    private static void settingsOption2() {
        System.out.println("""
                1.Language
                2.Cell info display
                3.Welcome note
                4.Network selection
                5.Lights
                6.Confirm SIM services actions
                7.Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 7:
                settings();
                break;
        }
    }

    private static void settingsOption3() {
        System.out.println("""
                1.PIN code request
                2.Call barring services
                3.Fixed dialling
                4.Closed user group
                5.Phone security
                6.Change access codes
                7.Back
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 7:
                settings();
                break;
        }
    }

    private static void callDivert() {
        System.out.println("""
                1.Call Divert
                2.Back
                """);
        System.out.println("Select 2 to go to previous menu: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 2:
                menu();
                break;
            default:
                System.out.println("Invalid, please enter a valid number: ");
                callDivert();
                break;
        }

    }
    private static void games(){
        System.out.println("""
                1.Games
                2.Back
                """);
        System.out.println("Select 2 to go to the previous menu: ");
        userInput = input.nextInt();
        switch (userInput){
            case 2:
                menu();
                break;
            default:
                System.out.println("Invalid, please enter a valid number: ");
                games();
                break;
        }
    }
    private static void calculator(){
        System.out.println("""
                1.Calculator
                2.Back
                """);
        System.out.println("Select 2 to go to the previous menu: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 2:
                menu();
                break;
            default:
                System.out.println("Invalid, please enter a valid number: ");
                calculator();
                break;
        }
    }
    private static void reminder(){
        System.out.println("""
                1.Reminder
                2.Back
                """);
        System.out.println("Select 2 to go to the previous menu: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 2:
                menu();
                break;
            default:
                System.out.println("Invalid, please enter a valid number: ");
                reminder();
                break;
        }
    }

    private static void clock() {
        System.out.println("""
                1.Alarm clock
                2.Clock settings
                3.Date setting
                4.Stopwatch
                5.Countdown timer
                6.Auto update of date and time
                7.Back
                """);
        System.out.println("Select 6 to go to main menu: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 7:
                menu();
                break;
            default:
                System.out.println("Invalid, please enter a valid number: ");
                clock();
                break;
        }
    }

    private static void profiles(){
        System.out.println("""
                1.Profiles
                2.Back
                """);
        System.out.println("Select 2 to go to the previous menu: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 2:
                menu();
                break;
            default:
                System.out.println("Invalid, please enter a valid number: ");
                profiles();
                break;
        }
    }
    private static void simServices(){
        System.out.println("""
                1.SIM services
                2.Back
                """);
        System.out.println("Select 2 to go to the previous menu: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 2:
                menu();
                break;
            default:
                System.out.println("Invalid, please enter a valid number: ");
                simServices();
                break;
        }
    }
    private static void nothingToSeeHereYet(){
        System.out.println("Nothing to see here yet!");
    }
    private static void exit(){
        //switch (userInput == 0){


        }
    }
//}






