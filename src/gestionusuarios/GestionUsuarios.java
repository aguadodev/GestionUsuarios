package gestionusuarios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GestionUsuarios extends JFrame {

    // Usuario admin declarado separadamente
    Usuario admin;
    // Array vacío de usuarios
    static Usuario[] usuarios = new Usuario[0];
    // Controles del formulario
    JTextField txtUsername, pwdPassword;
    JButton btnLogin;

    public GestionUsuarios() {
        // CREA EL USUARIO ADMIN
        admin = new Usuario("admin", "abc123.,", "admin@admin.org");

        // CREA LA VENTANA
        setTitle("Gestión de Usuarios");
        this.setResizable(false);
        setBounds(300, 300, 350, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // USUARIO (con valor por defecto)
        add(new JLabel("Usuario"));
        txtUsername = new JTextField("admin");        
        txtUsername.setPreferredSize(new Dimension(100, 20));
        add(txtUsername);

        // CONTRASEÑA (con valor por defecto)
        add(new JLabel("Contraseña"));
        pwdPassword = new JPasswordField("abc123.,");
        pwdPassword.setPreferredSize(new Dimension(100, 20));
        add(pwdPassword);

        // BOTÓN
        btnLogin = new JButton("Iniciar sesión");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();
            }
        });
        add(btnLogin);

        // Muestra la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        GestionUsuarios ventanaPrincipal = new GestionUsuarios();
    }

    private void validarLogin() {
        if (txtUsername.getText().equals(admin.username) && pwdPassword.getText().equals(admin.password)) {
            VentanaPrincipal frmVentanaPrincipal = new VentanaPrincipal();
            frmVentanaPrincipal.setVisible(true);
            this.setVisible(false);
            this.dispose();

        } else {
            //System.out.println("LOGIN FAIL");
            JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos!!",
                    "ERROR DE INICIO DE SESIÓN", JOptionPane.ERROR_MESSAGE);
        }
    }

}
