import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {

        Object[] options = {"By Sides", "By Angle"};
        var mode = JOptionPane.showOptionDialog(null, "How would you determine the type of triangle?",
                "Triangles", 0, 3, null, options, options[0]);

        if (mode == 0) {
            JTextField enterSideA = new JTextField();
            JTextField enterSideB = new JTextField();
            JTextField enterSideC = new JTextField();
            Object[] message = {"Side A", enterSideA, "Side B", enterSideB, "Side C", enterSideC};

            int option = JOptionPane.showConfirmDialog(null, message, "Enter Values:", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {

                int sideA = Integer.parseInt(enterSideA.getText());
                int sideB = Integer.parseInt(enterSideB.getText());
                int sideC = Integer.parseInt(enterSideC.getText());

                if ((sideA + sideB) > sideC) {
                    if (sideA == sideB && sideB == sideC && sideA == sideC) {
                        JOptionPane.showMessageDialog(null, "The triangle is EQUILATERAL");
                    } else if (sideA == sideB) {
                        JOptionPane.showMessageDialog(null, "The triangle is ISOSCELES");
                    } else {
                        JOptionPane.showMessageDialog(null, "The triangle is SCALENE");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "INVALID TRIANGLE");
                }
            }
        } else {
            JTextField enterAngle1 = new JTextField();
            JTextField enterAngle2 = new JTextField();
            JTextField enterAngle3 = new JTextField();
            Object[] message = {"Angle 1", enterAngle1, "Angle 2", enterAngle2, "Angle 3", enterAngle3};

            int option = JOptionPane.showConfirmDialog(null, message, "Enter Values:", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                int angle1 = Integer.parseInt(enterAngle1.getText());
                int angle2 = Integer.parseInt(enterAngle2.getText());
                int angle3 = Integer.parseInt(enterAngle3.getText());
                int sumOfAngles = angle1 + angle2 + angle3;
                if (sumOfAngles == 180){
                    if (angle1 < 90 && angle2 < 90 && angle3 < 90){
                        JOptionPane.showMessageDialog(null, "The triangle is ACUTE-ANGLED");
                    }
                    else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                        JOptionPane.showMessageDialog(null, "The triangle is RIGHT-ANGLED");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "The triangle is OBTUSE-ANGLED");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "INVALID TRIANGLE");
                }
            }
        }
    }
}