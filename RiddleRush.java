package WordPuzzle;

import java.util.*;

public class RiddleRush {
    private Scanner scanner;
    private List<String> riddles;
    private List<String> answers;
    private List<Integer> indices;

    // Constructor to initialize riddles and answers
    public RiddleRush() {
        scanner = new Scanner(System.in);
        
        riddles = Arrays.asList(
            "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
            "The more you take, the more you leave behind. What am I?",
            "What has to be broken before you can use it?",
            "I have branches, but no fruit, trunk, or leaves. What am I?",
            "The more of me you take, the more you leave behind. What am I?",
            "What has hands but can’t clap?",
            "What can run but never walks, has a mouth but never talks, has a head but never weeps, has a bed but never sleeps?",
            "What can fill a room but takes up no space?",
            "The more you take, the more you leave behind. What am I?",
            "What is full of holes but still holds water?",
            "What comes once in a minute, twice in a moment, but never in a thousand years?",
            "I shave every day, but my beard stays the same. What am I?",
            "What has words, but never speaks?",
            "What has an eye but cannot see?"
        );

        answers = Arrays.asList(
            "Pencil",
            "Echo",
            "Footsteps",
            "Egg",
            "Bank",
            "Footsteps",
            "Clock",
            "River",
            "Light",
            "Footsteps",
            "Sponge",
            "Letter M",
            "Barber",
            "Book",
            "Needle"
        );

        // Shuffle indices for randomness
        indices = new ArrayList<>();
        for (int i = 0; i < riddles.size(); i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
    }

    // Method to play the game
    public void playGame() {
        for (int index : indices) {
            System.out.println("\nRiddle: " + riddles.get(index));
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(answers.get(index))) {
                System.out.println(" Correct! You solved the riddle.");
            } else {
                System.out.println(" Incorrect. The answer is: " + answers.get(index));
            }

            // Ask if the player wants to continue
            System.out.print("Do you want to play another riddle? (yes/no): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println(" Thanks for playing!");
        scanner.close();
    }

    // Main method to run the game
    public static void main(String[] args) {
        RiddleRush game = new RiddleRush();
        game.playGame();
    }
}
