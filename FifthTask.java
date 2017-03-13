package ppvis_lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.table.*;


public class FifthTask {

    JPanel panelWithTable;

    public JPanel createPanelWithTable(){
        panelWithTable = new JPanel();

        JLabel label5 = new JLabel("Task 5");
        JTextField textField5 = new JTextField(20);
        textField5.setHorizontalAlignment(JTextField.CENTER);
        JButton inTable = new JButton("Put it");
        JButton inSecondCol = new JButton("1 -> 2");
        JButton inFirstCol = new JButton("2 -> 1");

        DefaultTableModel model = new DefaultTableModel(0, 2);
        JTable table5 = new JTable(model);
        model.addRow(new String[] {"Kathy", ""});
        model.addRow(new String[] {"Harry", "Kane"});

        JScrollPane scrollPane = new JScrollPane(table5);

        //table5.setPreferredScrollableViewportSize(table5.getPreferredSize());
        table5.setFillsViewportHeight(true);

        inTable.addActionListener(new ActionListener() {
            //int i =0;
            @Override
            public void actionPerformed(ActionEvent e) {
                /*while (!table5.getValueAt(i, 0).toString().equals("")){
                    i++;
                }*/
                if (e.getSource() == inTable && !textField5.equals("")){

                    model.addRow(new Object[]{textField5.getText(), ""});
                    textField5.setText("");
                    /*table5.setValueAt(textField5.getText(),i,0);
                    textField5.setText("");
                    i++;*/
                }
            }
        });
        inSecondCol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == inSecondCol){
                    int rowNumber = table5.getSelectedRow();
                    if (!table5.getValueAt(rowNumber, 0).toString().equals("")) {
                        String rowContent = table5.getValueAt(rowNumber, 0).toString();
                        table5.setValueAt(rowContent,rowNumber,1);
                        table5.setValueAt("",rowNumber,0);
                    }
                    else{
                        JOptionPane.showMessageDialog(panelWithTable, "Nothing to remove in Second Col.");
                    }
                }

            }
        });
        inFirstCol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == inFirstCol){
                    int rowNumber = table5.getSelectedRow();
                    if (!table5.getValueAt(rowNumber, 1).toString().equals("")) {
                        String rowContent = table5.getValueAt(rowNumber, 1).toString();
                        table5.setValueAt(rowContent,rowNumber,0);
                        table5.setValueAt("",rowNumber,1);
                    }
                    else{
                        JOptionPane.showMessageDialog(panelWithTable, "Nothing to remove in First Col.");
                    }
                }

            }
        });


        panelWithTable.add(label5);
        panelWithTable.add(textField5);
        panelWithTable.add(inTable);
        panelWithTable.add(inSecondCol);
        panelWithTable.add(inFirstCol);
        panelWithTable.add(scrollPane);

        return panelWithTable;
    }
}
