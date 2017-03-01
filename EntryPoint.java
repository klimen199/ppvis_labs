package ppvis_lab1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EntryPoint extends JFrame {


    EntryPoint(){
        super("My First Lab");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ----- первое задание -----

        Box box1 = Box.createVerticalBox();
        JLabel label1 = new JLabel("Task 1");
        String[] elements = new String[] {"element1", "element2"};
        JComboBox combo = new JComboBox(elements);
        combo.setSelectedIndex(0);
        JTextField textField1 = new JTextField(20);
        textField1.setCaretColor(Color.RED);
        textField1.setHorizontalAlignment(JTextField.RIGHT);
        JButton setIt = new JButton("Set It");

        setIt.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                String tempInCombo = textField1.getText();
                for (int i =0; i < combo.getItemCount(); i++){
                    if (combo.getItemAt(i).equals(tempInCombo)){
                        JOptionPane.showMessageDialog(box1, tempInCombo+" is alredy here");
                    }
                }
                if (textField1.getText() != null){
                    combo.addItem(textField1.getText());
                    textField1.setText(null);
                }


            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        box1.add(label1);
        box1.add(Box.createVerticalStrut(5));
        box1.add(textField1);
        box1.add(Box.createVerticalStrut(12));
        box1.add(setIt);
        box1.add(Box.createVerticalStrut(12));
        box1.add(combo);
        box1.add(Box.createVerticalStrut(25));

        // ----- второе задание -----

        Box box2 = Box.createVerticalBox();
        JLabel label2 = new JLabel("Task 2");
        JTextField textField2 = new JTextField(20);
        textField2.setHorizontalAlignment(JTextField.CENTER);
        JButton btnFrom = new JButton("Rename another");
        JButton btnIn = new JButton("Rename me");

        btnFrom.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (textField2.getText() != null){
                    btnIn.setText(textField2.getText());
                    textField2.setText(null);
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        btnIn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String tempText = btnFrom.getText();
                btnFrom.setText(btnIn.getText());
                btnIn.setText(tempText);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        box2.add(label2);
        box2.add(Box.createVerticalStrut(5));
        box2.add(textField2);
        box2.add(Box.createVerticalStrut(15));
        box2.add(btnFrom);
        box2.add(Box.createVerticalStrut(7));
        box2.add(btnIn);
        box2.add(Box.createVerticalStrut(25));


        // ----- третье задание -----
        Box box3 = Box.createVerticalBox();
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
                        return;
                    }
                    if (textField3.getText().equals(btnInGroup2.getText())) {
                        btnInGroup2.setSelected(true);
                        return;
                    }
                    if (textField3.getText().equals(btnInGroup3.getText())) {
                        btnInGroup3.setSelected(true);
                        return;
                    }
                    JOptionPane.showMessageDialog(box3, "No " + textField3.getText() + " in GroupBox");
                }
            }
        });

        box3.add(label3);
        box3.add(Box.createVerticalStrut(5));
        box3.add(textField3);
        box3.add(Box.createVerticalStrut(15));
        box3.add(btn3);
        box3.add(Box.createVerticalStrut(15));
        box3.add(btnInGroup1);
        box3.add(btnInGroup2);
        box3.add(btnInGroup3);



        Box box4 = Box.createVerticalBox();
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
                        check1.setSelected(true);
                        textField4.setText("");
                    }
                    else if (textField4.getText().equals(check2.getText())) {
                        check2.setSelected(true);
                        textField4.setText("");
                    }
                    else if (textField4.getText().equals(check3.getText())) {
                        check3.setSelected(true);
                        textField4.setText("");
                    }
                    else {JOptionPane.showMessageDialog(box4, "No " + textField4.getText() + " in CheckBox");
                        textField4.setText("");
                    }

                }
            }
        });

        box4.add(label4);
        box4.add(Box.createVerticalStrut(5));
        box4.add(textField4);
        box4.add(Box.createVerticalStrut(15));
        box4.add(btn4);
        box4.add(Box.createVerticalStrut(15));
        box4.add(check1);
        box4.add(check2);
        box4.add(check3);


        Box box5 = Box.createVerticalBox();
        JLabel label5 = new JLabel("Task 5");
        JTextField textField5 = new JTextField(20);
        textField5.setHorizontalAlignment(JTextField.CENTER);
        JButton btn5_1 = new JButton("Choose");
        JButton btn5_2 = new JButton("Choose");
        JButton btn5_3 = new JButton("Choose");

        String[] columnNames = {
                "Column1",
                "Column2"
        };
        String[][] data = {
                {"fhfh", ""},
                {"", ""},
                {"", "fhfhf"},
                {"", ""},
                {"fffff", ""}
        };
        JTable table5 = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table5);


        box5.add(label5);
        box5.add(Box.createVerticalStrut(5));
        box5.add(textField5);
        box5.add(Box.createVerticalStrut(15));
        box5.add(btn5_1);
        box5.add(btn5_2);
        box5.add(btn5_3);
        box5.add(Box.createVerticalStrut(15));
        box5.add(table5);
        box5.add(Box.createVerticalStrut(20));
        box5.add(scrollPane);

// Уточняем размеры компонентов
        //loginLabel.setPreferredSize(passwordLabel.getPreferredSize());
// Размещаем горизонтальные панели на одной вертикальной
        Box mainBox = Box.createHorizontalBox();

        mainBox.add(box1);
        mainBox.add(Box.createHorizontalStrut(50));
        mainBox.add(box2);
        mainBox.add(Box.createHorizontalStrut(50));
        mainBox.add(box3);
        mainBox.add(Box.createHorizontalStrut(50));
        mainBox.add(box4);
        mainBox.add(Box.createHorizontalStrut(50));
        mainBox.add(box5);
        setContentPane(mainBox);
        pack();


    }


    public static void main (String [] args) {
        JFrame myWindow = new EntryPoint();
        myWindow.setVisible(true);
    }
}

