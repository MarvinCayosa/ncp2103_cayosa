import javax.swing.*;

public class ArithmeticMethod {
    public static void main(String[] args) {
        JTextField enterInput1 = new JTextField();
        JTextField enterInput2 = new JTextField();
        JTextField enterInput3 = new JTextField();

        Object[] message = {"Enter Num 1:", enterInput1, "Enter Num 2:", enterInput2, "Enter Num 3:", enterInput3};


        int option = JOptionPane.showConfirmDialog(null, message, "Method", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {

            int num1 = Integer.parseInt(enterInput1.getText());
            int num2 = Integer.parseInt(enterInput2.getText());
            float num3 = Float.parseFloat(enterInput3.getText());

            String add = String.valueOf(addNumber(num1,num2,num3));
            String sub = String.valueOf(subtractNumber(num1,num2,num3));
            String mult = String.valueOf(multiplyNumber(num1,num2,num3));
            String div = String.valueOf(divideNumber(num1,num2,num3));

            JOptionPane.showMessageDialog(null, add + "\n" + sub + "\n"+ mult + "\n" + div);
        }
    }
    public static float addNumber(int num1, int num2, float num3){
        return num1 + num2 + num3;

    }
    public static float subtractNumber(int num1, int num2, float num3){
        return num1 - num2 - num3;

    }
    public static float multiplyNumber(int num1, int num2, float num3){
        return num1 * num2 * num3;

    }
    public static float divideNumber(int num1, int num2, float num3){
        return (num1 / num2)/ num3;

    }

}