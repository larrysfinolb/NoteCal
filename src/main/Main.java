package main;

import views.Login;

public class Main {

    // Metodo principal desde donde arranca toda la aplicacion
    public static void main(String[] args) {
        // Instanciamos la vista de Login y la hacemos visible
        Login login = new Login();
        login.setVisible(true);
    }
}
