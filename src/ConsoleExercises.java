import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.String;


public class ConsoleExercises {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        String name = "Melinda";
        int favNum= 17;
        System.out.printf("Hello, " + name + "\n");
        System.out.format("Hello %s, how are you today?",name);
        System.out.printf("Hello %s, your total is  $%d. %n ", name, favNum);
      Scanner scanner = new Scanner(System.in);

//        System.out.println("What is your favorite number?");
//        String num = scanner.nextLine();
//
//        System.out.println(num);

//      System.out.println("Hey there friend. What is on your mind?");
//        String input = scanner.nextLine();
//
//        System.out.println(input);
//
//
//        double pi = 3.14159;
//
//        System.out.println(pi);
//        System.out.printf("Value with 2 digits after decimal point %.2f %n", pi);
//
//        System.out.println("Please enter a number");
//
//        int userNum = scanner.nextInt();
//
//
//        System.out.println("User chose:" + userNum);
//
////        String eachWord = scanner.nextLine();
//
//        System.out.println("Please enter a few words");
//
//        String eachWord1 = scanner.next();
//        String eachWord2 = scanner.next();
//        String eachWord3 = scanner.next();
//
////        System.out.println("%s %s %s", eachWord1,eachWord2,eachWord3);
//
//        scanner.nextLine();
//        System.out.println("Gimme a sentence...");
//        String sent= scanner.nextLine();
//
//        System.out.printf("You entered: %s%n", sent);
//
//
//        System.out.println("~~~~~~~~~~");
//        System.out.println("What is the length of the room?");
//        String widthStr = scanner.nextLine();
//
//        int width = Integer.parseInt(widthStr);

//        System.out.println("The area of teh classroom is: %d units squared.%n", width * length);
        int x = 5;
        int y = 5;


        System.out.println(x * y);
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);

        System.out.println(x + " mod 2: "+ x % 2);



        System.out.println("Enter the first number");
        BufferedReader obj = new BufferedReader(new InputStreamReader((System.in)));
        int a=Integer.parseInt(obj.readLine());
        System.out.println("Enter the Second number");
        int b=Integer.parseInt(obj.readLine());
        int c=0;
        for(int i=0;i<b;i++){
            c=c+a;
        }
        System.out.println("The Product is "+c);




//        ??Table of powers

        System.out.println("Give me a number:");
            int num = scanner. nextInt();
            scanner.nextLine();
         System.out.println("Here is your table:");
         System.out.println(" Number      | Squared      |       Cubed");
         System.out.println("~~~~~~~~~~~~~~~");
         for(int h = 1; h <= num; h++){
             System.out.printf("%d        |  %d         | %d%n", h, h * h, h * h * h );
             System.out.printf("~~~~~~~~~~~~~~~~~~~~~~");

         }

    }

    public static int getInteger(int min, int max){
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        return userInput;
    }
}

//hello world