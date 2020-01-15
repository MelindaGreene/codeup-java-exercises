import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String yesNO = "y";

        while(yesNO.equalsIgnoreCase("y")){
            int i = input.nextInt();
            System.out.println("Enter a Intger");
            int startValue = 1;
            int inc = input.nextInt();

            for (int row =0; row < inc; row++) {
                int y = 1;

                for (int col = startValue; col < startValue + 3; col++) {

                    y = y * startValue;
                    System.out.print(y + " ");

                }


                System.out.println();
                startValue++;
            }

            System.out.println("Would you like to test another number Y/N");



            yesNO = input.nextLine();

        }





    }
}