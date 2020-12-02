package Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction1 extends JButton {

    private ButtonAction2 button2;
    private ActionLabel label;

    public ButtonAction1(String text) {
        super(text);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Performing action 1");
                button2.setEnabled(true);
                setEnabled(false);
            }
        });
    }

    public void setLabel(ActionLabel label) {
        this.label = label;
    }

    public void setButton2(ButtonAction2 button2) {
        this.button2 = button2;
    }
}