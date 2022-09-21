import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        
        Dealership dealership = new Dealership(cars);
        

        // Task 1 – Add user input.
        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String make = scan.nextLine();
        System.out.print("Enter your budget: ");
        int budget = scan.nextInt(); scan.nextLine();


        // Task 3 - Call the search action.
        // Task 4 - case 404
        // Task 5 – Selling the car.

        int index = dealership.search(make, budget);
        if (index == 404) {
            System.out.println("Feel free to browse through our collection of cars.\n");
            System.out.println(dealership);
        } else {
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                dealership.sell(index);
            }
        }
        
        scan.close();

    }
}

