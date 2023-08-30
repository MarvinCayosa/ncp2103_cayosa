import javax.swing.*;

public class Main5 {
    public static void main(String[] args) {
        String contactNo = JOptionPane.showInputDialog(null,"Enter 11-Digit Number:",
                "Telco Prefixes", JOptionPane.DEFAULT_OPTION);

        if (contactNo.length() == 11) {

            String firstFourDigits = contactNo.substring(0, 4);
            String firstFiveDigits = contactNo.substring(0, 5);

            switch (firstFiveDigits) {
                case "09173", "09175", "09176", "09253", "09256":
                        JOptionPane.showMessageDialog(null,
                        contactNo + " is a Globe Postpaid number.");
                        break;
                default:{  // Nested Switch: If none matched the five digits, it will be checking on the first four
                    switch (firstFourDigits) {
                        case "0905", "0966", "0915", "0916", "0917":
                                JOptionPane.showMessageDialog(null,
                                contactNo + " is a Globe/TM number.");
                                break;
                        case "0908", "0918", "0919", "0920", "0921":
                                JOptionPane.showMessageDialog(null,
                                contactNo + " is a Smart number.");
                                break;
                        case "0907", "0909", "0910", "0912", "0938":
                                JOptionPane.showMessageDialog(null,
                                contactNo + " is a TNT number.");
                                break;
                        default: JOptionPane.showMessageDialog(null,
                                contactNo + " is an INVALID NUMBER.");
                    }
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Input Error. Must be 11 Digits.");
        }
    }
}