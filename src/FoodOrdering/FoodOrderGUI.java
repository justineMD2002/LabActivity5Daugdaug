package FoodOrdering;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FoodOrderGUI extends JFrame {
    private JPanel pnlMain;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    FoodOrderGUI() {
        ButtonGroup b = new ButtonGroup();
        b.add(rbNone);
        b.add(rb5);
        b.add(rb10);
        b.add(rb15);
            btnOrder.addActionListener(e -> {
               double total = 0;
               if(cPizza.isSelected()) total += 100;
               if(cBurger.isSelected()) total += 80;
               if(cFries.isSelected()) total += 65;
               if(cSoftDrinks.isSelected()) total += 55;
               if(cTea.isSelected()) total += 50;
               if(cSundae.isSelected()) total += 40;

                if (rb5.isSelected()) total -= total * 0.05;
                else if (rb10.isSelected()) total -= total * 0.1;
                else if (rb15.isSelected()) total -= total * 0.15;

               JOptionPane.showMessageDialog(pnlMain, "The total price is Php " + String.format("%.2f", total));
        });
    }
    public static void main(String[] args){
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
