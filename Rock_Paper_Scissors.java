import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissors {

    public static void main(String[] args) {
        System.out.println("Lets Play Rock Paper Scissor's");
        System.out.println("In this game: ");
        System.out.println("Press 0 -> for Rock");
        System.out.println("      1 -> for Paper");
        System.out.println("      & 2 -> for Scissor's");
        System.out.println("      String's i'll be invalid");
        System.out.println("      other int enteries make's computer win.");
        int Round = 0;
        int userscore = 0;
        int compscore = 0;
        int tiescore = 0;

        while (Round <= 4) {
            Round++;
            System.out.println("Round " + Round);
            System.out.println("Enter your number");

            Scanner scn = new Scanner(System.in);
            int R1 = scn.nextInt();

            if (R1 == 0) {
                System.out.println("you entered: Rock");
            } else if (R1 == 1) {
                System.out.println("you entered: Paper");
            } else if (R1 == 2) {
                System.out.println("you entered: Scissor");
            }

            Random rand = new Random();
            int copt = rand.nextInt(3);

            if (copt == 0) {
                System.out.println("Computer's output is: Rock");
            } else if (copt == 1) {
                System.out.println("Computer's output is: Paper");
            } else {
                System.out.println("Computer's output is: Scissor");
            }

            //NOW

            if (copt == R1) {
                System.out.println("it's a tie!!");
                tiescore++;
            } else if (copt == 2 && R1 == 0) {
                System.out.println("User Won, Wohoooo!!");
                userscore++;
            } else if (copt == 0 && R1 == 1) {
                System.out.println("User Won, Wohoooo!!");
                userscore++;
            } else if (copt == 1 && R1 == 2) {
                System.out.println("User Won, Wohoooo!!");
                userscore++;
            } else {
                System.out.println("Computer Won!!");
                compscore++;
            }
            System.out.println("Round 1 result's");
            System.out.println("User: " + userscore + "  Computer: " + compscore + "  Tie: " + tiescore);
        }

/*
//  ------------------------------------------------------------------------------------------------
       System.out.println("NOW Round 2");
       System.out.println("Enter your number");

       int R2 = scn.nextInt();

       if (R2 == 0){
           System.out.println("you entered: Rock");
       }
       else if (R2 == 1) {
           System.out.println("you entered: Paper");
       }
       else if (R2 == 2){
           System.out.println("you entered: Scissor");
       }

       int copt2 = rand.nextInt(3);

       if (copt2 == 0){
           System.out.println("Computer's output is: Rock");
       }
       else if (copt2 == 1) {
           System.out.println("Computer's output is: Paper");
       }
       else if (copt2 == 2){
           System.out.println("Computer's output is: Scissor");
       }

       //NOW

       if (copt2==R2){
           System.out.println("it's a tie!!");
           tiescore++;
       }
       else if (copt2 == 2 && R2 == 0) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else if (copt2 == 0 && R2 == 1) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else if (copt2 == 1 && R2 == 2) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else {
           System.out.println("Computer Won!!");
           compscore++;
       }
       System.out.println("Round 2 result's");
       System.out.println("User: " + userscore + "  Computer: " + compscore + "  Tie: " + tiescore);
//  ------------------------------------------------------------------------------------------------
       System.out.println("NOW Round 3");
       System.out.println("Enter your number");

       int R3 = scn.nextInt();

       if (R3 == 0){
           System.out.println("you entered: Rock");
       }
       else if (R3 == 1) {
           System.out.println("you entered: Paper");
       }
       else if (R3 == 2){
           System.out.println("you entered: Scissor");
       }

       int copt3 = rand.nextInt(3);

       if (copt3 == 0){
           System.out.println("Computer's output is: Rock");
       }
       else if (copt3 == 1) {
           System.out.println("Computer's output is: Paper");
       }
       else if (copt3 == 2){
           System.out.println("Computer's output is: Scissor");
       }

       //NOW

       if (copt3 ==R3){
           System.out.println("it's a tie!!");
           tiescore++;
       }
       else if (copt3 == 2 && R3 == 0) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else if (copt3 == 0 && R3 == 1) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else if (copt3 == 1 && R3 == 2) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else {
           System.out.println("Computer Won!!");
           compscore++;
       }
       System.out.println("Round 3 result's");
       System.out.println("User: " + userscore + "  Computer: " + compscore + "  Tie: " + tiescore);
//  ------------------------------------------------------------------------------------------------
       System.out.println("NOW Round 4");
       System.out.println("Enter your number");

       int R4 = scn.nextInt();

       if (R4 == 0){
           System.out.println("you entered: Rock");
       }
       else if (R4 == 1) {
           System.out.println("you entered: Paper");
       }
       else if (R4 == 2){
           System.out.println("you entered: Scissor");
       }

       int copt4 = rand.nextInt(3);

       if (copt4 == 0){
           System.out.println("Computer's output is: Rock");
       }
       else if (copt4 == 1) {
           System.out.println("Computer's output is: Paper");
       }
       else if (copt4 == 2){
           System.out.println("Computer's output is: Scissor");
       }

       //NOW

       if (copt4 == R4){
           System.out.println("it's a tie!!");
           tiescore++;
       }
       else if (copt4 == 2 && R4 == 0) {
           System.out.println("User Won, Woho1ooo!!");
           userscore++;
       }
       else if (copt4 == 0 && R4 == 1) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else if (copt4 == 1 && R4 == 2) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else {
           System.out.println("Computer Won!!");
           compscore++;
       }
       System.out.println("Round 4 result's");
       System.out.println("User: " + userscore + "  Computer: " + compscore + "  Tie: " + tiescore);
//  ------------------------------------------------------------------------------------------------
       System.out.println("NOW Round 5");
       System.out.println("Enter your number");

       int R5 = scn.nextInt();

       if (R5 == 0){
           System.out.println("you entered: Rock");
       }
       else if (R5 == 1) {
           System.out.println("you entered: Paper");
       }
       else if (R5 == 2){
           System.out.println("you entered: Scissor");
       }

       int copt5 = rand.nextInt(3);

       if (copt5 == 0){
           System.out.println("Computer's output is: Rock");
       }
       else if (copt5 == 1) {
           System.out.println("Computer's output is: Paper");
       }
       else if (copt5 == 2){
           System.out.println("Computer's output is: Scissor");
       }

       //NOW

       if (copt5 == R5){
           System.out.println("it's a tie!!");
           tiescore++;
       }
       else if (copt5 == 2 && R5 == 0) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else if (copt5 == 0 && R5 == 1) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else if (copt5 == 1 && R5 == 2) {
           System.out.println("User Won, Wohoooo!!");
           userscore++;
       }
       else {
           System.out.println("Computer Won!!");
           compscore++;
       }
       System.out.println("Round 5 result's");
       System.out.println("User: " + userscore + "  Computer: " + compscore + "  Tie: " + tiescore);
*/

        System.out.println("After Concluding all the 5 rounds: ");
        if (compscore == userscore) {
            System.out.println("this game is tied!!");
        } else if (compscore > userscore) {
            System.out.println("Better Luck Next Time :(");
        } else {
            System.out.println("You Won, Wohoooo!!");

        }
    }
}