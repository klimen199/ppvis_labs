package ppvis_lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThirdTask {

    JPanel panelWithRadioBtn;

    public JPanel createPanelWithRadioBtn(){
        panelWithRadioBtn = new JPanel();

        JLabel label3 = new JLabel("Task 3");
        JTextField textField3 = new JTextField(20);
        textField3.setHorizontalAlignment(JTextField.CENTER);
        JButton btn3 = new JButton("Choose");
        JRadioButton btnInGroup1 = new JRadioButton ("1");
        JRadioButton btnInGroup2 = new JRadioButton ("2");
        JRadioButton btnInGroup3 = new JRadioButton ("3");
        ButtonGroup bg = new ButtonGroup(); // создаем группу взаимного исключения
        bg.add(btnInGroup1);
        bg.add(btnInGroup2);
        bg.add(btnInGroup3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField3.getText().equals("")) {
                    if (textField3.getText().equals(btnInGroup1.getText())) {
                        btnInGroup1.setSelected(true);
                        textField3.setText(null);
                        return;
                    }
                    if (textField3.getText().equals(btnInGroup2.getText())) {
                        btnInGroup2.setSelected(true);
                        textField3.setText(null);
                        return;
                    }
                    if (textField3.getText().equals(btnInGroup3.getText())) {
                        btnInGroup3.setSelected(true);
                        textField3.setText(null);
                        return;
                    }
                    JOptionPane.showMessageDialog(panelWithRadioBtn, "No " + textField3.getText() + " in GroupBox");
                    textField3.setText(null);
                }
            }
        });

        panelWithRadioBtn.add(label3);
        panelWithRadioBtn.add(textField3);
        panelWithRadioBtn.add(btn3);
        panelWithRadioBtn.add(btnInGroup1);
        panelWithRadioBtn.add(btnInGroup2);
        panelWithRadioBtn.add(btnInGroup3);

        return panelWithRadioBtn;
    }
}
