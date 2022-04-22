package gestionusuarios;

import java.util.Arrays;
/**
 * Clase con métodos genéricos
 */
public class UtilGenerico {
    
    static <U> int numeroDeNulos(U[] t){
        int cont = 0;
        for (U e : t){
            if (e == null){
                cont++;
            }
        }
        return cont;
    }
    
    public static <U> U[] add(U e, U[] t) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = e;
        return t;
    }

    
    public static <U> boolean buscar(U e, U[] t) {
        for (U ei : t){
            if (ei.equals(e)){
                return true;
            }
        }
        return false;
    }
    
}
