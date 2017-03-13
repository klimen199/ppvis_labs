package ppvis_lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstTask {

    JPanel panelWithComboBox;

    public JPanel createPanelWithComboBox(){
        panelWithComboBox = new JPanel();
        JLabel label1 = new JLabel("Task 1");
        String[] elements = new String[] {"element1", "element2"};
        JComboBox combo = new JComboBox(elements);
        combo.setSelectedIndex(0);
        JTextField textField1 = new JTextField(20);
        textField1.setCaretColor(Color.RED);
        textField1.setHorizontalAlignment(JTextField.RIGHT);
        JButton setIt = new JButton("Set It");
        setIt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tempInCombo = textField1.getText();
                for (int i =0; i < combo.getItemCount(); i++){
                    if (combo.getItemAt(i).equals(tempInCombo)){
                        JOptionPane.showMessageDialog(panelWithComboBox, tempInCombo+" is alredy here");
                        textField1.setText(null);
                        return;
                    }
                }

                if (textField1.getText() != null){
                    combo.addItem(textField1.getText());
                    textField1.setText(null);
                }
            }
        });

        panelWithComboBox.add(label1);
        panelWithComboBox.add(textField1);
        panelWithComboBox.add(setIt);
        panelWithComboBox.add(combo);

        return panelWithComboBox;
    }

}
