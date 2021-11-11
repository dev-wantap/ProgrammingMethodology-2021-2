import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton extends JButton implements ActionListener {

    public ExitButton(String name) {
        super(name);
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        java.lang.System.exit(0);
    }
}
