package ppvis_lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FourthTask {

    JPanel panelWithCheckBox;

    public JPanel createPanelWithCheckBox(){
        panelWithCheckBox = new JPanel();

        JLabel label4 = new JLabel("Task 4");
        JTextField textField4 = new JTextField(20);
        textField4.setHorizontalAlignment(JTextField.CENTER);
        JButton btn4 = new JButton("Choose");
        JCheckBox check1 = new JCheckBox("1");
        JCheckBox check2 = new JCheckBox("2");
        JCheckBox check3 = new JCheckBox("3");
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField4.getText().equals("")) {
                    if (textField4.getText().equals(check1.getText())) {
                        if (check1.isSelected())
                            check1.setSelected(false);
                        else
                            check1.setSelected(true);
                        textField4.setText("");
                    }
                    else if (textField4.getText().equals(check2.getText())) {
                        if (check2.isSelected())
                            check2.setSelected(false);
                        else
                            check2.setSelected(true);
                        textField4.setText("");
                    }
                    else if (textField4.getText().equals(check3.getText())) {
                        if (check3.isSelected())
                            check3.setSelected(false);
                        else
                            check3.setSelected(true);
                        textField4.setText("");
                    }
                    else {
                        JOptionPane.showMessageDialog(panelWithCheckBox, "No " + textField4.getText() + " in CheckBox");
                        textField4.setText("");
                    }

                }
            }
        });

        panelWithCheckBox.add(label4);
        panelWithCheckBox.add(textField4);
        panelWithCheckBox.add(btn4);
        panelWithCheckBox.add(check1);
        panelWithCheckBox.add(check2);
        panelWithCheckBox.add(check3);

        return panelWithCheckBox;

    }
}
