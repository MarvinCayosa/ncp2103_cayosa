import javax.swing.JOptionPane;

public class Main7 {
    public static void main(String[] args) {
        float enterMonthlySal = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter your monthly salary:",
                "Monthly Income Tax", JOptionPane.DEFAULT_OPTION));

        float annualSal = enterMonthlySal * 12;
        float incomeTax = 0;

        if (annualSal < 250000){
            incomeTax = 0;
        }
        else if (annualSal > 250000 && annualSal < 400000) {
            incomeTax = (float) ((annualSal - 250000) * 0.20);
        }
        else if (annualSal > 400000 && annualSal < 800000) {
            incomeTax = (float) (30000 + (annualSal - 400000) * 0.25);
        }
        else if (annualSal > 800000 && annualSal < 2000000) {
            incomeTax = (float) (130000 + (annualSal - 800000) * 0.30);
        }
        else if (annualSal > 2000000 && annualSal < 8000000) {
            incomeTax = (float) (490000 + (annualSal - 2000000) * 0.32);
        }
        else{
            incomeTax = (float) (2410000 + (annualSal -8000000) * 0.35);
        }
        JOptionPane.showMessageDialog(null, "Monthly Salary: " + "PHP " + enterMonthlySal +
                "\nEstimated Tax: " + "PHP " + String.format("%.2f",incomeTax/12));
    }
}
