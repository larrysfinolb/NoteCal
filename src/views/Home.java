package views;

import components.InputText;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = "";
                float suma = 0;
                float max = 0;
                float min = 20;
                float average = 0;

                //fisica
                if (!isNumeric(inputFisica.getField().getText())) {
                    message = "La nota de " + inputFisica.getLabel().getText() + " no es un número.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    float nota = Float.parseFloat(inputFisica.getField().getText());
                    if (nota > 20 || nota < 0) {
                        message = "La nota de " + inputFisica.getLabel().getText() + " debe ser un número entre 0 y 20";
                        JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        suma+=nota;
                        max = nota > max ? nota : max;
                        min = nota < min ? nota : min;
                    }
                }
                
                //quimica
                if (!isNumeric(inputQuimica.getField().getText())) {
                    message = "La nota de " + inputQuimica.getLabel().getText() + " no es un número.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    float nota = Float.parseFloat(inputQuimica.getField().getText());
                    if (nota > 20 || nota < 0) {
                        message = "La nota de " + inputQuimica.getLabel().getText() + " debe ser un número entre 0 y 20";
                        JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        suma+=nota;
                        max = nota > max ? nota : max;
                        min = nota < min ? nota : min;
                    }
                }
                
                //biologia
                if (!isNumeric(inputBiologia.getField().getText())) {
                    message = "La nota de " + inputBiologia.getLabel().getText() + " no es un número.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    float nota = Float.parseFloat(inputBiologia.getField().getText());
                    if (nota > 20 || nota < 0) {
                        message = "La nota de " + inputBiologia.getLabel().getText() + " debe ser un número entre 0 y 20";
                        JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        suma+=nota;
                        max = nota > max ? nota : max;
                        min = nota < min ? nota : min;
                    }
                }
                
                //matematicas
                if (!isNumeric(inputMatematica.getField().getText())) {
                    message = "La nota de " + inputMatematica.getLabel().getText() + " no es un número.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    float nota = Float.parseFloat(inputMatematica.getField().getText());
                    if (nota > 20 || nota < 0) {
                        message = "La nota de " + inputMatematica.getLabel().getText() + " debe ser un número entre 0 y 20";
                        JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        suma+=nota;
                        max = nota > max ? nota : max;
                        min = nota < min ? nota : min;
                    }
                }
                
                //historia
                if (!isNumeric(inputHistoria.getField().getText())) {
                    message = "La nota de " + inputHistoria.getLabel().getText() + " no es un número.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    float nota = Float.parseFloat(inputHistoria.getField().getText());
                    if (nota > 20 || nota < 0) {
                        message = "La nota de " + inputHistoria.getLabel().getText() + " debe ser un número entre 0 y 20";
                        JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        suma+=nota;
                        max = nota > max ? nota : max;
                        min = nota < min ? nota : min;
                    }
                }
                
                //geografia
                if (!isNumeric(inputGeografia.getField().getText())) {
                    message = "La nota de " + inputGeografia.getLabel().getText() + " no es un número.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    float nota = Float.parseFloat(inputGeografia.getField().getText());
                    if (nota > 20 || nota < 0) {
                        message = "La nota de " + inputGeografia.getLabel().getText() + " debe ser un número entre 0 y 20";
                        JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        suma+=nota;
                        max = nota > max ? nota : max;
                        min = nota < min ? nota : min;
                    }
                }
                
                //dibujo
                if (!isNumeric(inputDibujo.getField().getText())) {
                    message = "La nota de " + inputDibujo.getLabel().getText() + " no es un número.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    float nota = Float.parseFloat(inputDibujo.getField().getText());
                    if (nota > 20 || nota < 0) {
                        message = "La nota de " + inputDibujo.getLabel().getText() + " debe ser un número entre 0 y 20";
                        JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        suma+=nota;
                        max = nota > max ? nota : max;
                        min = nota < min ? nota : min;
                    }
                }
                
                //educ fisica
                if (!isNumeric(inputEducFisica.getField().getText())) {
                    message = "La nota de " + inputEducFisica.getLabel().getText() + " no es un número.";
                    JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    float nota = Float.parseFloat(inputEducFisica.getField().getText());
                    if (nota > 20 || nota < 0) {
                        message = "La nota de " + inputEducFisica.getLabel().getText() + " debe ser un número entre 0 y 20";
                        JOptionPane.showMessageDialog(new JFrame(), message, "Error al validar los campos",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        suma+=nota;
                        max = nota > max ? nota : max;
                        min = nota < min ? nota : min;
                    }
                }
                
                if (message == ""){
                    average = suma / 8;
                    
                    notaBaja.setText("Nota más baja: " + min);
                    notaAlta.setText("Nota más alta: " + max);
                    sumaTotal.setText("Suma total: " + suma);
                    promedio.setText("Promedio: " + average);
                }
            }
        });
    }

    public static boolean isNumeric(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
