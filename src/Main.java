import java.util.Random;
import java.util.Scanner;
public class Main {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);
    static String[] words = {
            "apple", "water", "house", "chair", "table", "plant", "happy", "light", "music", "smile",
            "bread", "shirt", "sweet", "glass", "green", "heart", "cloud", "clock", "mouse", "clean",
            "river", "stone", "brush", "night", "sound", "train", "paper", "sleep", "dance", "candy"
    };
    static String word;
    static char[] progress;
    static char guess;
    static int wrong_attempts = 0;
    static final int max_attempts = 7;
    static int lives_left = max_attempts-wrong_attempts;
    public static void pickWord() {
        word = words[rand.nextInt(words.length)];
        progress = new char[word.length()];
    }
    public static void welcome(){
        System.out.println("Welcome to Hangman!");
        System.out.println("You will need to guess a random word based on its length");
        System.out.println("You have "+max_attempts+" wrong attempts before the game ends");
        System.out.println("Guess only 1 letter of the word at a time");
        System.out.println("The word is displayed after every guess");
        System.out.println("Good luck!");
        System.out.println("-------------------------");
    }
    public static void fill_blank(){
        for(int i=0;i<word.length();i++){
            progress[i]='_';
        }
    }
    public static void display_blank(){
        System.out.print("\nWord: ");
        for(int i=0;i<word.length();i++){
            System.out.print(progress[i]);
        }
        System.out.println();
    }
    public static boolean hasWon(){
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(progress[i]!=c)
                return false;
        }
        return true;
    }
    public static void hangmanImage() {
        System.out.println();
        if (wrong_attempts == 0) {
            System.out.println("   ____________");
            System.out.println("   |          |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            display_blank();
        }
        if (wrong_attempts == 1) {
            System.out.println("   ____________");
            System.out.println("   |         _|_");
            System.out.println("   |        /   \\");
            System.out.println("   |       |     |");
            System.out.println("   |        \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            display_blank();
        }
        if (wrong_attempts == 2) {
            System.out.println("   ____________");
            System.out.println("   |         _|_");
            System.out.println("   |        /   \\");
            System.out.println("   |       |     |");
            System.out.println("   |        \\_ _/");
            System.out.println("   |          |");
            System.out.println("   |          |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            display_blank();
        }
        if (wrong_attempts == 3) {
            System.out.println("   ____________");
            System.out.println("   |         _|_");
            System.out.println("   |        /   \\");
            System.out.println("   |       |     |");
            System.out.println("   |        \\_ _/");
            System.out.println("   |         _|_");
            System.out.println("   |        /   ");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            display_blank();
        }
        if (wrong_attempts == 4) {
            System.out.println("   ____________");
            System.out.println("   |         _|_");
            System.out.println("   |        /   \\");
            System.out.println("   |       |     |");
            System.out.println("   |        \\_ _/");
            System.out.println("   |         _|_");
            System.out.println("   |        / | \\");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
            display_blank();
        }
        if (wrong_attempts == 5) {
            System.out.println("   ____________");
            System.out.println("   |         _|_");
            System.out.println("   |        /   \\");
            System.out.println("   |       |     |");
            System.out.println("   |        \\_ _/");
            System.out.println("   |         _|_");
            System.out.println("   |        / | \\");
            System.out.println("   |          |");
            System.out.println("   |          |");
            System.out.println("___|___");
            display_blank();
        }
        if (wrong_attempts == 6) {
            System.out.println("   ____________");
            System.out.println("   |         _|_");
            System.out.println("   |        /   \\");
            System.out.println("   |       |     |");
            System.out.println("   |        \\_ _/");
            System.out.println("   |         _|_");
            System.out.println("   |        / | \\");
            System.out.println("   |          |");
            System.out.println("   |        /  ");
            System.out.println("___|___    /   ");
            display_blank();
        }
        if (wrong_attempts == max_attempts) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |         _|_");
            System.out.println("   |        /   \\");
            System.out.println("   |       |     |");
            System.out.println("   |        \\_ _/");
            System.out.println("   |         _|_");
            System.out.println("   |        / | \\");
            System.out.println("   |          |");
            System.out.println("   |        /   \\ ");
            System.out.println("___|___    /     \\");
            System.out.print("The word was " + word);
        }
    }
    public static void guess(){
        int g;
        System.out.println("\nLives: "+lives_left);
        hangmanImage();
        while((wrong_attempts < max_attempts) && (!hasWon())){
            g=0;
            System.out.print("\nGuess a letter in the word: ");
            String input = sc.nextLine().toLowerCase().trim();
            if (input.length() == 1 && Character.isLetter(input.charAt(0)))
                guess = input.charAt(0);
            else {
                System.out.println("You must guess only 1 letter at a time!!");
                continue;
            }
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==guess) {
                    progress[i] = guess;
                    g++;
                }
            }
            if(g==0){
                wrong_attempts++;
                lives_left--;
                System.out.println("Wrong guess!");
            }
            else {
                System.out.println("Correct guess!");
            }
            System.out.println("Lives: "+lives_left);
            hangmanImage();
        }
        if(hasWon()) {
            System.out.println("You have won the game!");
            System.out.print("You have guessed the word " + word + " correctly");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        welcome();
        pickWord();
        fill_blank();
        Thread.sleep(800);
        guess();
    }
}