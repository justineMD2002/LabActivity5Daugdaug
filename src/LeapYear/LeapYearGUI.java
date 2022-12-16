package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel pnlMain;
    LeapYearGUI() {
        btnCheckYear.addActionListener(e -> {
            try {
                int input = Integer.parseInt(tfYear.getText());
                if(input % 4 == 0) {
                    if(input % 100 != 0) JOptionPane.showMessageDialog(pnlMain, "Leap Year");
                    else if(input % 100 == 0 && input % 400 == 0) JOptionPane.showMessageDialog(pnlMain, "Leap Year");
                    else JOptionPane.showMessageDialog(pnlMain, "Not a Leap Year");
                } else JOptionPane.showMessageDialog(pnlMain, "Not a Leap Year");
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(pnlMain, "Invalid input! Please enter a valid year.");
            }
        });
    }
    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(500, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
