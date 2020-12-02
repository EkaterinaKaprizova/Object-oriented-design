package Mediator;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private ButtonAction1 b1;
    private ButtonAction2 b2;
    private ActionLabel label;

    public Window() {
        pack();
        b1 = new ButtonAction1("Action 1");
        b2 = new ButtonAction2("Action 2");
        label = new ActionLabel("");

        b1.setButton2(b2);
        b1.setLabel(label);

        b2.setButton1(b1);
        b2.setLabel(label);

        setLayout(new FlowLayout());
        add(label);
        add(b1);
        add(b2);
        pack();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
