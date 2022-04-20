
package gestionusuarios;

import java.time.LocalDateTime;
import java.util.Objects;

public class Usuario {
    // ATRIBUTOS
    String username;
    String password;
    String email;
    LocalDateTime ultimoAcceso;

    // CONSTRUCTORES
    public Usuario(String username, String password, String email, LocalDateTime ultimoAcceso) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.ultimoAcceso = ultimoAcceso;
    }

    public Usuario(String username, String password, String email) {
        this(username, password, email, null);
    }

    public Usuario() {
    }

    // REDEFINIR MÉTODOS DE CLASE OBJECT
    @Override
    public String toString() {
//        return "Usuario{" + "username=" + username + '}';
        return username;
    }        

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }
    
    /* TODO...
    
    Orden natural y Comparadores
    validarUsuario()
    etc.    
    
    */
        
    
}
