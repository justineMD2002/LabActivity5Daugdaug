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
    SimpleCalcGUI() {
        btnCompute.addActionListener(e -> {
            if(cbOperations.getSelectedItem() == "+") tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) + Double.parseDouble(tfNumber2.getText())));
            else if(cbOperations.getSelectedItem() == "-") tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) - Double.parseDouble(tfNumber2.getText())));
            else if(cbOperations.getSelectedItem() == "*") tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) * Double.parseDouble(tfNumber2.getText())));
            else if(cbOperations.getSelectedItem() == "/") tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) / Double.parseDouble(tfNumber2.getText())));
        });
    }
    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(600, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
        app.pnlMain.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }
}
