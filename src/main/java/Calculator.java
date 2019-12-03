
import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) {



       int option = 0;

       Scanner sc = new Scanner(System.in);
       System.out.println("\nPlease, choose the number from 1 to 3 to  navigate through the menu:"
               + "\n 1. Basic Calculator"
               + "\n 2. Scientific Calculator"
               + "\n 3. Exit"
       );
       option = sc.nextInt();
       while (option != 3) {
           switch (option) {
               case 1: BasicCalculator bs = new BasicCalculator();
                     break;
               case 2: ScientificCalculator scient = new ScientificCalculator();
                     break;



           }

       }
   }
}
