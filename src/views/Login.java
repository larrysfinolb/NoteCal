package views;

import components.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {

    public Login() {
        setTitle("Inicio de sesión");
        setSize(355, 490);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Obtenemos el panel y le establecemos el layout a null
        Container contenedor = getContentPane();
        contenedor.setLayout(null);

        // Creamos el input para la cedula acompañado de su respectivo label
        InputText inputCedula = new InputText("Cedula del estudiante", 20, 20, 300, 25);
        contenedor.add(inputCedula.getLabel());
        contenedor.add(inputCedula.getField());

        // Creamos el input para el nombre acompañado de su respectivo label
        InputText inputNombre = new InputText("Nombre del estudiante", 20, 95, 300, 25);
        contenedor.add(inputNombre.getLabel());
        contenedor.add(inputNombre.getField());

        // Creamos el input para el grado acompañado de su respectivo label
        InputText inputGrado = new InputText("Grado del estudiante", 20, 170, 300, 25);
        contenedor.add(inputGrado.getLabel());
        contenedor.add(inputGrado.getField());

        // Creamos el input para la seccion acompañado de su respectivo label
        InputText inputSeccion = new InputText("Seccion del estudiante", 20, 245, 300, 25);
        contenedor.add(inputSeccion.getLabel());
        contenedor.add(inputSeccion.getField());

        // Creamos el input para la contraseña acompañado de su respectivo label
        InputPassword inputContrasena = new InputPassword("Contraseña del estudiante", 20, 320, 300, 25);
        contenedor.add(inputContrasena.getLabel());
        contenedor.add(inputContrasena.getField());

        // Creamos el boton
        JButton boton = new JButton("Iniciar sesión");
        boton.setBounds(85, 395, 177, 35);
        contenedor.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = "";
                if (!inputCedula.getField().getText().matches("^[0-9]{7,9}$")) {
                    message = "El campo " + inputCedula.getLabel().getText() + " es incorrecto, deberian haber de 7 a 9 numeros.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                }
                if (!inputNombre.getField().getText().matches("^[A-ZÁ-ÚÑ][a-zA-Zá-úÁ-ÚñÑ]{2,}(?: [A-ZÁ-ÚÑ][a-zA-Zá-úÁ-ÚñÑ]*){0,2}$")) {
                    message = "El campo " + inputNombre.getLabel().getText() + " es incorrecto, debe empezar en mayusculas y contener al menos 3 letras.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                }
                if (!inputGrado.getField().getText().matches("^[1-9]|10|11$")) {
                    message = "El campo " + inputGrado.getLabel().getText() + " es incorrecto, debe ser un número entre el 1 y el 11.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                }
                if (!inputSeccion.getField().getText().toUpperCase().matches("^A|B|C$")) {
                    message = "El campo " + inputSeccion.getLabel().getText() + " es incorrecto, las secciones disponibles son A, B y C";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                }
                String passText = new String(inputContrasena.getField().getPassword());
                if (!passText.equals("123456")) {
                    message = "La contraseña es incorrecta";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                }
                
                if (message == ""){
                    //Home home = new Home();
                    //home.setVisible(true);
                }
            }
        });
    }

}
