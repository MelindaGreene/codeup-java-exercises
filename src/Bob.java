import java.util.Scanner;

public class Bob {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        String yesNO = "Y";
        while(yesNO.equalsIgnoreCase("y")) {
            System.out.println("Talk to Bob");
            String userInput = input.nextLine();
            System.out.println(userInput);
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.endsWith(" ")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
            System.out.println("Would you like to ask Bob another question [y/n]");
            yesNO = input.nextLine();
        }
    }
}