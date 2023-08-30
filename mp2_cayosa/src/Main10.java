import java.util.*;
import javax.swing.*;

public class Main10 {
    public static void main(String[] args) {
        Random randNum = new Random();

        String[] message = {"Play", "Cancel"};

        int choice = JOptionPane.showOptionDialog(null, "  Welcome to IN-BETWEEN",
                "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, message, message[0]);

        if (choice == JOptionPane.YES_OPTION) {
            int firstCard = 8;
            int secondCard = 8;
            int thirdCard = randNum.nextInt(14);

            String info = "Card 1: " + firstCard + "                    Card 2: " + secondCard + "\n " +
                    "=".repeat(22) + "\n                   Card 3: ?";

            // Higher or Lower

            if (firstCard == secondCard){
                String[] options2 = {"Higher", "Lower"};
                int select2 = JOptionPane.showOptionDialog(null, info,
                        "IN-BETWEEN", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options2, options2[0]);

                if (select2 == JOptionPane.YES_OPTION) {
                    if (thirdCard > firstCard)
                        JOptionPane.showMessageDialog(null, "      Congrats! You won!"
                                + "\n        Third Card is " + thirdCard);
                    else
                        JOptionPane.showMessageDialog(null, "        Sorry, you lost!" +
                                "\n        Third Card is " + thirdCard);
                }
                else if (select2 == JOptionPane.NO_OPTION){
                    if (thirdCard < firstCard)
                        JOptionPane.showMessageDialog(null, "      Congrats! You won!"
                                + "\n        Third Card is " + thirdCard);
                    else
                        JOptionPane.showMessageDialog(null, "        Sorry, you lost!"+
                                "\n        Third Card is " + thirdCard);
                }
            }
            else {
                // Deal of no Deal
                String[] options = {"DEAL", "NO DEAL"};

                int select = JOptionPane.showOptionDialog(null, info,
                        "IN-BETWEEN", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, options, options[0]);

                if (select == JOptionPane.YES_OPTION) {

                    if ((firstCard > thirdCard && secondCard < thirdCard) || (firstCard < thirdCard && secondCard > thirdCard)){
                        JOptionPane.showMessageDialog(null, "       Congrats! You won!"
                                + "\n        Third Card is " + thirdCard);
                    } else {
                        JOptionPane.showMessageDialog(null, "    Wrong! Sorry, you lost."+
                                "\n         Third Card is " + thirdCard);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "    Thank you for playing!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "    Thank you for playing!");
        }
    }
}
