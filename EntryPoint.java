package ppvis_lab1;

import javax.swing.*;

public class EntryPoint {

    public JFrame CreateFrame(String name){
        JFrame frame = new JFrame();
        frame.setName(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FirstTask page1 = new FirstTask();
        SecondTask page2 = new SecondTask();
        ThirdTask page3 = new ThirdTask();
        FourthTask page4 = new FourthTask();
        FifthTask page5 = new FifthTask();

        Box mainBox = Box.createHorizontalBox();
        mainBox.add(page1.createPanelWithComboBox());
        mainBox.add(Box.createHorizontalStrut(10));
        mainBox.add(page2.createPanelWithSwapBtn());
        mainBox.add(Box.createHorizontalStrut(10));
        mainBox.add(page3.createPanelWithRadioBtn());
        mainBox.add(Box.createHorizontalStrut(10));
        mainBox.add(page4.createPanelWithCheckBox());
        mainBox.add(Box.createHorizontalStrut(10));
        mainBox.add(page5.createPanelWithTable());
        frame.setContentPane(mainBox);

        return frame;
    }

}

