package views;

import components.*;
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {

    public Login() {
        setTitle("Inicio de sesión");
        setSize(355, 490);
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
    }
}
