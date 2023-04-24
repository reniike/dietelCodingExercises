package chapterFour.chapterFour;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
                """);

        System.out.println("Select 1, 2, 4, 5, 6 and 11 to see their sub options: ");
        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("""
                        1.Search
                        2.Service Nos
                        3.Add name
                        4.Erase
                        5.Edit
                        6.Assign tone
                        7.Send b'card
                        8.Option
                        9.Speed dials
                        10.Voice tags
                        """);
                System.out.println("Select option 8 to see sub options: ");
                userInput = input.nextInt();
                switch (userInput) {
                    case 8:
                        System.out.println("""
                                1.Type of view
                                2.Memory status
                                """);
                        break;
                }
                break;
            case 2:
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
                        System.out.println("""
                                1.Set 1
                                2.Common 3
                                """);
                        System.out.println("Select either 1 or 2 to see sub options: ");
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1:
                                System.out.println("""
                                        1.Message centre number
                                        2.Messages sent as
                                        3.Message validity
                                        """);
                                break;

                            case 2:
                                System.out.println("""
                                        1.Common
                                        2.Delivery reports
                                        3.Reply via same centre
                                        """);
                                break;
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
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
                //break;
                System.out.println("Select option 5, 6 or 7 to see their sub options: ");
                userInput = input.nextInt();
                switch (userInput) {
                    case 5:
                        System.out.println("""
                                1.Last call duration
                                2.All calls' duration
                                3.Received calls' duration
                                4.Dialled calls' duration
                                5.Clear timers
                                """);
                        break;
                    case 6:
                        System.out.println("""
                                1.Last call cost
                                2.All calls' cost
                                3.Clear counters
                                """);
                        break;
                    case 7:
                        System.out.println("""
                                1.Call cost limit
                                2.Show costs in
                                """);
                        break;
                }
                break;
            case 5:
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
                        """);
                break;
            case 6:
                System.out.println("""
                        1.Call settings
                        2.Phone settings
                        3.Security settings
                        4.Restore factory settings
                        """);
                System.out.println("Select option 1, 2, 3 or 4 to see their sub options: ");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("""
                                1.Automatic redial
                                2.Speed dialling
                                3.Call waiting options
                                4.Own number sending
                                5.Phone line in use
                                6.Automatic answer
                                """);
                        break;
                    case 2:
                        System.out.println("""
                                1.Language
                                2.Cell info display
                                3.Welcome note
                                4.Network selection
                                5.Lights
                                6.Confirm SIM services actions
                                """);
                        break;
                    case 3:
                        System.out.println("""
                                1.PIN code request
                                2.Call barring services
                                3.Fixed dialling
                                4.Closed user group
                                5.Phone security
                                6.Change access codes
                                """);
                        break;
                }
                break;
            case 7:
                System.out.println("Call divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminder");
                break;
            case 11:
                System.out.println("""
                        1.Alarm clock
                        2.Clock settings
                        3.Date setting
                        4.Stopwatch
                        5.Countdown timer
                        """);
                break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM services");
                break;

        }
    }

}

