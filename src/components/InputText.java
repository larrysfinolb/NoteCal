package components;

import javax.swing.*;

public class InputText {

    JLabel label;
    JTextField field;

    public InputText(String label, int x, int y, int width, int height) {
        this.label = new JLabel(label);
        this.label.setBounds(x, y, width, 25);

        this.field = new JTextField();
        this.field.setBounds(x, y + 25, width, 30);
    }

    public JLabel getLabel() {
        return this.label;
    }

    public JTextField getField() {
        return this.field;
    }
}
