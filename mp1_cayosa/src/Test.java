import java.util.*;
import javax.swing.*;


public class Test {
    public static void main(String[] args) {
        Random randNum = new Random();

        int totalPoints = 0;
        int numOfLives = 5;
        int random = randNum.nextInt(10); // Generate random number outside the loop
        System.out.println(random);

        while (numOfLives != 0) {
            int guessNum = Integer.parseInt(JOptionPane.showInputDialog(
                    "Number of Lives: " + numOfLives +
                            "\nTotal Points: " + totalPoints +
                            "\nInput Your Guess:"));

            if (guessNum != random) {
                numOfLives -= 1;
                if (guessNum < random) {
                    JOptionPane.showMessageDialog(null,  "Number of Lives: " + numOfLives + "\nIncorrect Guess: Higher!");

                } else {
                    JOptionPane.showMessageDialog(null,  "Number of Lives: " + numOfLives + "\nIncorrect Guess: LOWER!");

                }
            } else {
                totalPoints += 10;
                JOptionPane.showMessageDialog(null, "\nTotal Points: " + totalPoints + "\nCONGRATULATIONS! Your Guess is Correct!");
                random = randNum.nextInt(10);
                System.out.println(random); // Generate a new random number again
            }
        }
        JOptionPane.showMessageDialog(null, "GAME OVER!\n" + "Total Points: " + totalPoints);
    }
}