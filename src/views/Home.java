package views;

import components.InputText;
import java.awt.*;
import javax.swing.*;

public class Home extends JFrame {

    public Home() {
        setTitle("Principal");
        setSize(820, 460);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Obtenemos el panel y le establecemos el layout a null
        Container contenedor = getContentPane();
        contenedor.setLayout(null);

        // Creamos el titulo de la pagina
        JLabel titulo = new JLabel("Calcular promedio de las notas");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setBounds(225, 20, 500, 25);
        contenedor.add(titulo);

        // Creamos el input para la materia de fisica acompañado de su respectivo label
        InputText inputFisica = new InputText("Física", 20, 80, 180, 25);
        contenedor.add(inputFisica.getLabel());
        contenedor.add(inputFisica.getField());

        // Creamos el input para la materia de quimica acompañado de su respectivo label
        InputText inputQuimica = new InputText("Química", 215, 80, 180, 25);
        contenedor.add(inputQuimica.getLabel());
        contenedor.add(inputQuimica.getField());

        // Creamos el input para la materia de biologia acompañado de su respectivo label
        InputText inputBiologia = new InputText("Bíologia", 410, 80, 180, 25);
        contenedor.add(inputBiologia.getLabel());
        contenedor.add(inputBiologia.getField());

        // Creamos el input para la materia de matematica acompañado de su respectivo label
        InputText inputMatematica = new InputText("Matemática", 605, 80, 180, 25);
        contenedor.add(inputMatematica.getLabel());
        contenedor.add(inputMatematica.getField());

        // Creamos el input para la materia de historia acompañado de su respectivo label
        InputText inputHistoria = new InputText("Historia", 20, 150, 180, 25);
        contenedor.add(inputHistoria.getLabel());
        contenedor.add(inputHistoria.getField());

        // Creamos el input para la materia de geografia acompañado de su respectivo label
        InputText inputGeografia = new InputText("Geografía", 215, 150, 180, 25);
        contenedor.add(inputGeografia.getLabel());
        contenedor.add(inputGeografia.getField());

        // Creamos el input para la materia de dibujo acompañado de su respectivo label
        InputText inputDibujo = new InputText("Dibujo", 410, 150, 180, 25);
        contenedor.add(inputDibujo.getLabel());
        contenedor.add(inputDibujo.getField());

        // Creamos el input para la materia de educacion fisica acompañado de su respectivo label
        InputText inputEducFisica = new InputText("Educ. Física", 605, 150, 180, 25);
        contenedor.add(inputEducFisica.getLabel());
        contenedor.add(inputEducFisica.getField());

        // Creamos el boton
        JButton boton = new JButton("Calcular resultados");
        boton.setBounds(300, 240, 180, 35);
        contenedor.add(boton);

        // Creamos las etiquecas de los resultados
        Font fuente = new Font("Arial", Font.BOLD, 16);
        JLabel notaBaja = new JLabel("Nota más baja: ");
        JLabel notaAlta = new JLabel("Nota más alta: ");
        JLabel sumaTotal = new JLabel("Suma total: ");
        JLabel promedio = new JLabel("Promedio: ");
        // Establecemos la fuente de las etiquetas
        notaBaja.setFont(fuente);
        notaAlta.setFont(fuente);
        sumaTotal.setFont(fuente);
        promedio.setFont(fuente);
        // Establecemos los tamaños y posiciones de las etiquetas
        notaBaja.setBounds(300, 290, 180, 30);
        notaAlta.setBounds(300, 320, 180, 30);
        sumaTotal.setBounds(300, 350, 180, 30);
        promedio.setBounds(300, 380, 180, 30);
        // Añadimos cada una de las etiquetas al contenedor
        contenedor.add(notaBaja);
        contenedor.add(notaAlta);
        contenedor.add(sumaTotal);
        contenedor.add(promedio);
    }
}
