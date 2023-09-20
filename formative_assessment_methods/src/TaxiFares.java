import javax.swing.*;

public class TaxiFares {
    public static void main(String[] args) {
        float distance = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter Distance in km: "));
        JOptionPane.showMessageDialog(null , totalFare(distance));
    }
    public static float totalFare(float distance){
        float BASEFARE = 60;
        float totalFare = BASEFARE + (distance * 25.5f);
        return totalFare;

    }

}
