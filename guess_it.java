import java.util.Random;
import java.util.Scanner;

class game{
   private int usr;
   private int chance;
   private int cum;

   public void rand(int r, int p){
       Random rdm = new Random();
       cum = rdm.nextInt(r+1,p+1);
   }

   public void takeuserinpt(int inp){
        usr = inp;
   }
   public void setChance(int c){
        chance = c;
   }
   public int getChance(){
        return chance;
   }
   public int isCorrect() {
       if (usr == cum) {
           System.out.println("You Guessed it right!!");
           return 1;
       }
       else if (cum > usr) {
           System.out.println("small dihh small Guess, Try again!!");
       }
       else {
           System.out.println("small dihh BIG Guess, huhhh...., Try again!!");
       }
       return 0;
   }
   public void showResult(){
        System.out.printf("The number was: %d\n", cum);
   }
}

public class guess_it {
   public static void main() {
       System.out.println("Enter numbers you want to play in between and number of chance's u wanna try out");
       Scanner sc = new Scanner(System.in);
       game user = new game();
       user.rand(sc.nextInt(),sc.nextInt());
       user.setChance(sc.nextInt());
       for (int i=1; i<=user.getChance(); i++){
       System.out.printf("Enter GUESS no %d: ", i);
       user.takeuserinpt(sc.nextInt());
           if(user.isCorrect()==1){
               break;
           }
       }
       user.showResult();
   }
}

/* NORMAL METHOD
 {
   public static void main() {
       System.out.println("Guess the number between 0 to 100 \n You have only 5 chance.");
       Scanner sc = new Scanner(System.in);
       Random rdm = new Random();
       int cum = rdm.nextInt(101);
       for (int i = 1; i<=5; i++){
       int usr = sc.nextInt();
           if (cum == usr){
               System.out.println("You Guessed it right!!");
               break;
           }
           else if (cum > usr){
               System.out.println("small dihh small Guess, Try again!!");
           }
           else {
               System.out.println("small dihh BIG Guess, huhhh...., Try again!!");
           }
       }
       System.out.printf("The number was: %d", cum);
    }

*/