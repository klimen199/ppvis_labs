package ppvis_lab1;

import javax.swing.*;

public class Main {
    public static void main (String [] args) {
        JFrame myWindow = new EntryPoint().CreateFrame("My First Lab");
        myWindow.setSize(1800, 210);
        myWindow.setVisible(true);
    }
}
