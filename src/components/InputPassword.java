package components;

import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class InputPassword {
    JLabel label;
    JPasswordField field;

    public InputPassword(String label, int x, int y, int width, int height) {
        this.label = new JLabel(label);
        this.label.setBounds(x, y, width, 25);

        this.field = new JPasswordField();
        this.field.setBounds(x, y + 25, width, 30);
    }

    public JLabel getLabel() {
        return this.label;
    }

    public JPasswordField getField() {
        return this.field;
    }
}
