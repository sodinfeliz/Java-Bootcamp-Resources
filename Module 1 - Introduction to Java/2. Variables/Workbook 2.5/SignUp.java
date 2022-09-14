import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();
        //Ask for their last name.
        System.out.println("What is you last name?");
        String lastName = scan.nextLine();
        //Ask: how old are you?
        System.out.println("How old are you?");
        int age = scan.nextInt();
        ///Ask them to make a username.
        scan.nextLine();
        System.out.println("Make a username");
        String username = scan.nextLine();
        //Ask what city they live in.
        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        //Ask what country that's from.
        System.out.println("What country is that from");
        String country = scan.nextLine();

        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!\n");

        //Print their information like so:
        System.out.println("Your information:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
        scan.close();
    }
}
