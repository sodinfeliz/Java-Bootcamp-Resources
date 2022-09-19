import java.util.Scanner;

public class Hangman {

    public static String[] words = {
        "ant", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat", 
        "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", 
        "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", 
        "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", 
        "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", 
        "ram", "rat", "raven","rhino", "salmon", "seal", "shark", "sheep", 
        "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", 
        "trout", "turkey", "turtle", "weasel", "whale", "wolf", "wombat", "zebra"
    };

    public static String[] gallows = {
        " +---+\n" +
        " |   |\n" +
        "     |\n" +
        "     |\n" +
        "     |\n" +
        "     |\n" +
        "=========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "     |\n" +
        "     |\n" +
        "     |\n" +
        "=========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        " |   |\n" +
        "     |\n" +
        "     |\n" +
        "=========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|   |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +
        "/    |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" + 
        "/ \\  |\n" +
        "     |\n" +
        " =========\n"
    };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String word = selectWord();
        char[] wordArray = word.toCharArray();
        char[] progress = new char[wordArray.length];
        for (int i = 0; i < progress.length; i++) {
            progress[i] = '_';
        }

        char guess;
        char[] misses = new char[6];
        int numMisses = 0;

        while (true) {
            System.out.print("\n");
            System.out.println(gallows[numMisses]);
            System.out.print("Word:    ");
            displayProgress(progress);
            System.out.print("\nMisses:  ");
            displayMisses(misses);
            System.out.print("\nGuess:   ");
            guess = scan.nextLine().charAt(0);

            if (!matchOrNot(wordArray, guess, progress)) {
                misses[numMisses++] = guess;
                if (numMisses == 6) {
                    System.out.print("\n");
                    System.out.println(gallows[numMisses]);
                    System.out.println("RIP!");
                    System.out.println("\nThe word was: '" + word + "'");
                    break;
                }
            } else if (matchAll(progress)) {
                System.out.print("\n");
                System.out.println(gallows[numMisses]);
                System.out.print("Word:    ");
                displayProgress(progress);
                System.out.println("\nGOOD WORK!");
                break;
            }
        }

        scan.close();
    }

    public static String selectWord() {
        int index = (int)(Math.random() * words.length);
        return words[index];
    }

    public static void displayProgress(char[] progress) {
        for (int i = 0; i < progress.length; i++) {
            System.out.print(progress[i] + " ");
        }
        System.out.print("\n");
    }

    /**Display the misses characters
     * 
     * @param misses
     */
    public static void displayMisses(char[] misses) {
        for (int i = 0; i < misses.length; i++) {
            if (misses[i] != 0) {
                System.out.print(misses[i]);
            } else {
                break;
            }
        }
        System.out.print("\n");
    }

    public static boolean matchOrNot(char[] word, char guess, char[] progress) {
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == guess) {
                count++;
                progress[i] = guess;
            }
        }
        return count > 0;
    }

    public static boolean matchAll(char[] progress) {
        for (int i = 0; i < progress.length; i++) {
            if (progress[i] == '_') {
                return false;
            }
        }
        return true;
    }
    
}





