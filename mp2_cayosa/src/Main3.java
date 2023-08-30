import javax.swing.*;

public class Main3 {
    public static void main(String[] args) {
        JTextField enterDistance = new JTextField();
        JTextField enterEfficiency = new JTextField();
        JTextField enterPrice = new JTextField();

        Object[] message = {"Distance in km:", enterDistance,
                            "Kilometers per gallon:", enterEfficiency,
                            "Price per gallon:", enterPrice};

        int option = JOptionPane.showConfirmDialog(null, message, "Mabuhay Miles", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION){
            float distance = Float.parseFloat(enterDistance.getText());
            float fuelEff = Float.parseFloat(enterEfficiency.getText());
            float ppg = Float.parseFloat(enterPrice.getText());

            float gallonsUsed = distance / fuelEff;
            float tripCost = gallonsUsed * ppg;

            JOptionPane.showMessageDialog(null, "The total cost of the trip is:\nPHP " +
                    String.format("%.2f", tripCost));
        }
    }
}
