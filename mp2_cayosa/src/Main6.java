import javax.swing.*;

public class Main6 {
    public static void main(String[] args) {
    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Value",
            "Hep-Hep Hooray", JOptionPane.DEFAULT_OPTION));

    if ((num % 3 == 0) && (num % 5 == 0)){
        JOptionPane.showMessageDialog(null, "Hep-Hep Hooray!");
    }
    else if (num % 5 == 0){
        JOptionPane.showMessageDialog(null, "Hooray");
    }
    else if (num % 3 == 0){
        JOptionPane.showMessageDialog(null, "Hep-Hep");
    }
    else{
        JOptionPane.showMessageDialog(null, "Oh no!");
    }
    }
}