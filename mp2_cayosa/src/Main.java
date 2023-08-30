import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JTextField enterBill = new JTextField();
        JTextField enterTip = new JTextField();
        Object[] message = {
                "Subtotal Bill:", enterBill,
                "Tip (%)", enterTip
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Bill Calculator",
                JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION){

            float subtotalBill = Float.parseFloat(enterBill.getText());
            float tip = Float.parseFloat(enterTip.getText());

            float tipAmount = subtotalBill * (tip / 100);
            float totalBill = tipAmount + subtotalBill;

            JOptionPane.showMessageDialog(null,
                    "Subtotal Bill = PHP " + subtotalBill +
                    "\nTip = " + tip + "%\n" + "-".repeat(45) + "\nTip Amount = PHP " +
                    (Math.round(tipAmount * 100.0) / 100.0) + "\n" + "-".repeat(45)
                    + "\nTotal Bill = PHP " + (Math.round(totalBill * 100.0) / 100.0));
        }
    }
}