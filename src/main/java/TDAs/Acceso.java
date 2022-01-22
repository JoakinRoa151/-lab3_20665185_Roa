package TDAs;
import java.util.ArrayList;
public class Acceso {
    private int idDocumento;
    private ArrayList<String>  nombresUsuarios;
    private String permiso;

    public int getIdDocumento() {
        return idDocumento;
    }

    public ArrayList<String> getNombresUsuarios() {
        return nombresUsuarios;
    }

    public String getPermiso() {
        return permiso;
    }



    public Acceso(int idDocumento, ArrayList<String> listaUsuarios, String permiso) {
        this.idDocumento = idDocumento;
        this.nombresUsuarios = listaUsuarios;
        this.permiso = permiso;
    }
}
