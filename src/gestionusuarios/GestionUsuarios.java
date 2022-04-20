
package gestionusuarios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GestionUsuarios extends JFrame{
    
    Usuario admin;
    static Usuario[] usuarios = new Usuario[0];
    JTextField txtUsername, pwdPassword;
    JButton btnLogin;
    
    public GestionUsuarios() {
        // CREA EL USUARIO ADMIN
        admin = new Usuario("admin", "abc123.,", "admin@admin.org");
        
        // CREA LA VENTANA
        setTitle("Gestión de Usuarios");
        setBounds(300, 300, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout());
        add(new JLabel("Usuario"));
        txtUsername = new JTextField();
        add(txtUsername);
        add(new JLabel("Contraseña"));
        pwdPassword = new JPasswordField();
        add(pwdPassword);
        btnLogin = new JButton("Iniciar sesión");
        btnLogin.addActionListener(new OyenteBoton());
        add(btnLogin);   
        
        setVisible(true);                
    }

    
    
    public static void main(String[] args) {
        GestionUsuarios ventanaPrincipal = new GestionUsuarios();
        
        
    }

// CLASE INTERNA
class OyenteBoton implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (txtUsername.getText().equals(admin.username) && pwdPassword.getText().equals(admin.password)){
            //System.out.println("LOGIN OK");
            //JOptionPane.showMessageDialog(null, "Bienvenid@!!",
            //        "INICIO DE SESIÓN CON ÉXITO", JOptionPane.INFORMATION_MESSAGE);            
            //Mostrar ventana Nuevo Usuario
            
            VentanaPrincipal frmVentanaPrincipal = new VentanaPrincipal();
            frmVentanaPrincipal.setVisible(true);
            
/*            NuevoUsuario frmNuevoUsuario = new NuevoUsuario();
            frmNuevoUsuario.setVisible(true);*/
            
        } else {
            //System.out.println("LOGIN FAIL");
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos!!",
                    "ERROR DE INICIO DE SESIÓN", JOptionPane.ERROR_MESSAGE);
        }
    }
    }
    
    
    
}
