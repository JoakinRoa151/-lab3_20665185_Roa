package TDAs;
import java.util.ArrayList;
public class Acceso {
    public int getIdDocumento() {
        return idDocumento;
    }

    public ArrayList<String> getListaUsuarios() {
        return listaUsuarios;
    }

    public String getPermiso() {
        return permiso;
    }

    private int idDocumento;
    private ArrayList<String>  listaUsuarios;
    private String permiso;

    public Acceso(int idDocumento, ArrayList<String> listaUsuarios, String permiso) {
        this.idDocumento = idDocumento;
        this.listaUsuarios = listaUsuarios;
        this.permiso = permiso;
    }
}
