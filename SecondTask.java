package ppvis_lab1;

import javax.swing.*;
import java.awt.event.*;


public class SecondTask {

    JPanel panelWithSwapBtn;

    public JPanel createPanelWithSwapBtn(){
        panelWithSwapBtn = new JPanel();
        JLabel label2 = new JLabel("Task 2");
        JTextField textField2 = new JTextField(20);
        textField2.setHorizontalAlignment(JTextField.CENTER);
        JButton btnFrom = new JButton("Rename another");
        JButton btnIn = new JButton("Rename me");
        btnFrom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField2.getText() != null){
                    btnIn.setText(textField2.getText());
                    textField2.setText(null);
                }
            }
        });
        btnIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tempText = btnFrom.getText();
                btnFrom.setText(btnIn.getText());
                btnIn.setText(tempText);
            }
        });

        panelWithSwapBtn.add(label2);
        panelWithSwapBtn.add(textField2);
        panelWithSwapBtn.add(btnFrom);
        panelWithSwapBtn.add(btnIn);

        return panelWithSwapBtn;
    }
}
