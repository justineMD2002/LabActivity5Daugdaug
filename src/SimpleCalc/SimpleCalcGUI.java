package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JPanel pnlMain;
    private JTextField tfResult;
    private JLabel lblResult;
    private JTextField tfNumber2;
    private JPanel pnlMain2;
    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(550, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
