package ppvis_lab1;

import javax.swing.*;
import java.awt.*;

public class EntryPoint {

    public JFrame CreateFrame(String name){
        JFrame frame = new JFrame();
        frame.setName(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        frame.add(p);

        // к панели добавляем менеджер GridLayout и устанавливаем размеры таблицы 3*3.
        p.setLayout(new GridLayout(2,1));

        FirstTask page1 = new FirstTask();
        SecondTask page2 = new SecondTask();
        ThirdTask page3 = new ThirdTask();
        FourthTask page4 = new FourthTask();
        FifthTask page5 = new FifthTask();
        AdditionTask page6 = new AdditionTask();

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
        //frame.setContentPane(mainBox);

        p.add(page6.createAdditionalPanel());
        p.add(mainBox);



        // к панели добавляем кнопку и устанавливаем для нее менеджер в верхнее расположение.



        return frame;
    }

}

