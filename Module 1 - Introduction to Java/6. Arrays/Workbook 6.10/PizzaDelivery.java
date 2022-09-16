import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: 
         *   2. Then, pick up the result using Scanner.
         */
        System.out.println("How many pizza toppings do you want?. ");
        int number = scan.nextInt();
        scan.nextLine();

        // Task 2 – Create the array here
        String[] toppings = new String[number];

        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         * 
         */

        /** Task 4 – Pick up the user's toppings and store them in the array.
         *  
         *  See the workbook article for more detail  
         * 
         */
        System.out.println("Great, enter each topping!");
        for (int i = 0; i < number; i++) {
            System.out.print((i+1) + ". ");
            toppings[i] = scan.nextLine();
        }

        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */
        System.out.println("\nThank you! Here are the toppings your ordered");
        for (int i = 0; i < number; i++) {
            System.out.print((i+1) + ". ");
            System.out.println(toppings[i]);
        }


        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */
        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();


         
    }
}
