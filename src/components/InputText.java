package components;

import javax.swing.*;

// Definimos una clase InputText la cual funcionara como componente
public class InputText {

    // Declaramos el label y el input del componente
    JLabel label;
    JTextField field;

    // Definimos al constructor con los parametros necesarios
    public InputText(String label, int x, int y, int width, int height) {
        // Establecemos el label y su posicion
        this.label = new JLabel(label);
        this.label.setBounds(x, y, width, 25);

        // Establecemos el input y su posicion
        this.field = new JTextField();
        this.field.setBounds(x, y + 25, width, 30);
    }

    // Definimos un metedo para retornar el label
    public JLabel getLabel() {
        return this.label;
    }

    // Definimos un metodo para retornar el input
    public JTextField getField() {
        return this.field;
    }
}
