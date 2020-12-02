package Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction2 extends JButton {

    private ButtonAction1 button1;
    private ActionLabel label;

    public ButtonAction2(String text) {
        super(text);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Performing action 2");
                button1.setEnabled(true);
                setEnabled(false);
            }
        });
    }

    public void setLabel(ActionLabel label) {
        this.label = label;
    }

    public void setButton1(ButtonAction1 button1) {
        this.button1 = button1;
    }

}
