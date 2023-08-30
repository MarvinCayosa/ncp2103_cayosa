import javax.swing.*;

public class Main4 {
    public static void main(String[] args) {
        float change = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter Change Amount:",
                "Change Counter", JOptionPane.QUESTION_MESSAGE));

        // Separate int and decimal values
        int changeInt = (int) change;
        float getDecimal =  (change - changeInt) * 100;
        int decimalInt = Math.round(getDecimal);

        System.out.println(decimalInt);

        // Integer values
        int peso1 = 1;
        int peso5 = 5;
        int peso10 = 10;
        int peso20 = 20;
        int peso50 = 50;
        int peso100 = 100;
        int peso200 = 200;
        int peso500 = 500;
        int peso1000 = 1000;

        // Decimal Values
        int cent10 = 10;
        int cent5 = 5;
        int cent1 = 1;

        // Determine the number of denomination
        int countPeso1000 = changeInt / peso1000;   // 1000
        changeInt = changeInt % peso1000;
        int countPeso500 = changeInt / peso500;     // 500
        changeInt = changeInt % peso500;
        int countPeso200 = changeInt / peso200;     // 200
        changeInt = changeInt % peso200;
        int countPeso100 = changeInt / peso100;     // 100
        changeInt = changeInt % peso100;
        int countPeso50 = changeInt / peso50;       // 50
        changeInt = changeInt % peso50;
        int countPeso20 = changeInt / peso20;       // 20
        changeInt = changeInt % peso20;
        int countPeso10 = changeInt / peso10;       // 10
        changeInt = changeInt % peso10;
        int countPeso5 = changeInt / peso5;         // 5
        changeInt = changeInt % peso5;
        int countPeso1 = changeInt / peso1;         // 1
        changeInt = changeInt % peso1;
        int countCent10 = decimalInt / cent10;      // 10 cents
        decimalInt = decimalInt % cent10;
        int countCent5 = decimalInt / cent5;        // 5 cents
        decimalInt = decimalInt % cent5;
        int countCent1 = decimalInt / cent1;        // 1 cents
        decimalInt = decimalInt % cent1;

        String result = "Change breakdown: Php " + change + "\n";
        result += "Peso" + "\n" + "=".repeat(25);
        result += "\nPhp 1000: " + (countPeso1000 == 0 ? "--" : countPeso1000) + "\n";
        result += "Php 500: " + (countPeso500 == 0 ? "--" : countPeso500) + "\n";
        result += "Php 200: " + (countPeso200 == 0 ? "--" : countPeso200) + "\n";
        result += "Php 100: " + (countPeso100 == 0 ? "--" : countPeso100) + "\n";
        result += "Php 50: " + (countPeso50 == 0 ? "--" : countPeso50) + "\n";
        result += "Php 20: " + (countPeso20 == 0 ? "--" : countPeso20) + "\n";
        result += "Php 10: " + (countPeso10 == 0 ? "--" : countPeso10) + "\n";
        result += "Php 5: " + (countPeso5 == 0 ? "--" : countPeso5) + "\n";
        result += "Php 1: " + (countPeso1 == 0 ? "--" : countPeso1) + "\n";
        result += "\nCents" + "\n" + "=".repeat(25);
        result += "\n10 Cents: " + (countCent10 == 0 ? "--" : countCent10) + "\n";
        result += "5 Cents: " + (countCent5 == 0 ? "--" : countCent5) + "\n";
        result += "1 Cents: " + (countCent1 == 0 ? "--" : countCent1) + "\n";

        JOptionPane.showMessageDialog(null, result,
                "Change Breakdown", JOptionPane.INFORMATION_MESSAGE);
    }
}