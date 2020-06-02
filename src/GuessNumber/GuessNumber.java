package GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guess Number Game!");
        System.out.println("Please enter your name: ");

        Scanner scanner =new Scanner(System.in);
        String name=scanner.next();
        System.out.println("Hello there: "+name);


            System.out.println("Shall we start?");
        System.out.println("\t1.yes");
        System.out.println("\t2.no");
            int start = scanner.nextInt();

            //user must enter yes to begin
            while (start!=1){
                System.out.println("Shall we start?");
                System.out.println("\t1.yes");
                System.out.println("\t2.no");
                start=scanner.nextInt();
            }
                Random random= new Random();
                int rand=random.nextInt(20)+1;

                System.out.println("please enter your guess");
                int guess=scanner.nextInt();

                int timesTried=0;
                boolean hasWon=false;
                boolean shouldFinish =false;

                while (!shouldFinish){
                    timesTried++;
                    if (timesTried<5){
                        if (guess==rand){
                            hasWon=true;
                            shouldFinish=true;
                            System.out.println("you are right!");
                        }
                        else if (guess>rand){
                            System.out.println("guess lower");
                            guess=scanner.nextInt();
                        }
                        else {
                            System.out.println("guess higher");
                            guess=scanner.nextInt();
                        }


                    }
                    else   {
                        shouldFinish=true;
                    }
                }



            if (hasWon){
                System.out.println("Congratulations! You guessed "+timesTried+" times.");
            }
            else   {
                System.out.printf("Game over! The random number was: "+rand);
            }








    }
}
