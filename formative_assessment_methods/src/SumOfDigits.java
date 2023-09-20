import javax.swing.*;
public class SumOfDigits {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number:"));
        JOptionPane.showMessageDialog(null,sumDigits(num));
        }
        // HELLO GITHUB
      public static int sumDigits(int num) {
          int count1 = num / 100;
          num = num % 100;
          int count2 = num / 10;
          num = num % 10;
          int count3 = num;
          return  count1 + count2 + count3;
      }

    }

