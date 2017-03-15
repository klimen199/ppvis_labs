package ppvis_lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.*;


public class AdditionTask {
    JPanel panelWithAdditionalTask;
    JTextField textForColumns;
    JTextField textForRows;
    boolean tableIsPainted = false;
    boolean isRunning = false;
    JTable table;
    JButton createTable;
    JButton actionInTable;

    public JPanel createAdditionalPanel() {
        panelWithAdditionalTask = new JPanel();
        Box generalBox = Box.createVerticalBox();
        JLabel labelColumn = new JLabel("Column: ");
        textForColumns = new JTextField(10);
        JLabel labelRow = new JLabel("Row: ");
        textForRows = new JTextField(10);
        createTable = new JButton("Create");
        actionInTable = new JButton("Play / stop");

        Box box1 = Box.createHorizontalBox();
        box1.add(labelColumn);
        box1.add(textForColumns);
        box1.add(labelRow);
        box1.add(textForRows);
        box1.add(createTable);
        generalBox.add(box1);
        generalBox.add(Box.createVerticalStrut(3));
        generalBox.add(actionInTable);
        generalBox.add(Box.createVerticalStrut(10));

        createTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!tableIsPainted && !textForColumns.getText().equals("") && !textForRows.getText().equals("")) {
                    tableIsPainted = true;
                    table = new JTable(Integer.parseInt(textForRows.getText()), Integer.parseInt(textForColumns.getText()));
                    generalBox.add(table);

                    panelWithAdditionalTask.revalidate();
                } else {
                    JOptionPane.showMessageDialog(panelWithAdditionalTask, "Enter number of Cilumn & Row");
                }
            }
        });

        ActionListener doMooving = new ActionListener() {
            int i = 0;
            int j = 0;
            int k = 0;
            int m = 0;
            int checkMooving = 0;
            boolean controlInAlgoritm = false;
            boolean checkInStart = false;
            boolean checkInStart2 = false;
            String temp;
            String temp2;
            String temp3;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (controlInAlgoritm) {
                    if (k < table.getColumnCount()) {
                        if (k == 0 && !checkInStart2) {
                            if (table.getValueAt(m, table.getColumnCount() - 1) == null)
                                temp3 = "";
                            else
                                temp3 = table.getValueAt(m, table.getColumnCount() - 1).toString();

                            if (table.getValueAt(m, k) == null)
                                temp = "";
                            else
                                temp = table.getValueAt(m, k).toString();
                            table.setValueAt(null, m, k);
                        }
                        if (table.getValueAt(m, k + 1) == null)
                            temp2 = "";
                        else
                            temp2 = table.getValueAt(m, k + 1).toString();
                        table.setValueAt(temp, m, k + 1);
                        temp = temp2;
                        k++;

                        if (k >= table.getRowCount() - 1) {
                            k = 0;
                            table.setValueAt(temp3, m, k);
                            m++;
                            checkInStart2 = false;
                            if (m >= table.getRowCount()) {
                                controlInAlgoritm = false;
                                checkInStart = false;
                                i = 0;
                                j = 0;
                            }
                        }
                    }
                } else {
                    if (i < table.getRowCount()) {
                        checkMooving++;
                        if (checkMooving >= 2 * table.getRowCount() * table.getColumnCount() + 1) {
                            controlInAlgoritm = true;
                            k = 0;
                            m = 0;
                            checkMooving = 0;
                        }
                        if (!checkInStart && i == 0 && j == 0) {
                            checkInStart = true;
                            if (table.getValueAt(i, j) == null)
                                temp = "";
                            else
                                temp = table.getValueAt(i, j).toString();
                            table.setValueAt(null, i, j);
                        }
                        if (table.getValueAt(i + 1, j) == null)
                            temp2 = "";
                        else
                            temp2 = table.getValueAt(i + 1, j).toString();
                        table.setValueAt(temp, i + 1, j);
                        temp = temp2;
                        i++;
                        if (i >= table.getRowCount() - 1) {
                            i = -1;
                            j++;
                            if (j >= table.getColumnCount()) {
                                j = 0;
                                i = -1;
                            }
                        }


                    }
                }


            }
        };

        Timer timer = new Timer(350, doMooving);


        actionInTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isRunning) {
                    timer.start();
                    isRunning = true;
                } else {
                    timer.stop();
                    isRunning = false;
                }
            }
        });

        panelWithAdditionalTask.add(generalBox);
        return panelWithAdditionalTask;
    }


}
