
package gestionusuarios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GestionUsuarios extends JFrame{
    
    Usuario admin;
    JTextField username, password;
    JButton login;
    
    public GestionUsuarios() {
        // CREA EL USUARIO ADMIN
        admin = new Usuario("admin", "abc123.,", "admin@admin.org");
        
        // CREA LA VENTANA
        setTitle("Gestión de Usuarios");
        setBounds(300, 300, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout());
        add(new JLabel("Usuario"));
        username = new JTextField();
        add(username);
        add(new JLabel("Contraseña"));
        password = new JPasswordField();
        add(password);
        login = new JButton("Iniciar sesión");
        login.addActionListener(new OyenteBoton());
        add(login);   
        
        setVisible(true);
                
    }

    
    
    public static void main(String[] args) {
        GestionUsuarios ventanaPrincipal = new GestionUsuarios();
        
        
    }

// CLASE INTERNA
class OyenteBoton implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (username.getText().equals(admin.username) && password.getText().equals(admin.password)){
            //System.out.println("LOGIN OK");
            JOptionPane.showMessageDialog(null, "Bienvenid@!!",
                    "INICIO DE SESIÓN CON ÉXITO", JOptionPane.INFORMATION_MESSAGE);            
            //...
            
        } else {
            //System.out.println("LOGIN FAIL");
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos!!",
                    "ERROR DE INICIO DE SESIÓN", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    
    
    
}
