package TDAs;
import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;


public class Paradigmadocs {
    private String nombre;
    private LocalDate fechaGdocs;
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Documento> listaDocumentos;
    private String usuarioActivo;
    private ArrayList<Acceso> listaAccesos;

    LocalDate fecha = LocalDate.now();

    public Paradigmadocs(String nombre,LocalDate fecha) {
        this.nombre = nombre;
        this.fechaGdocs = fecha;
        this.listaUsuarios = new ArrayList<>();
        this.listaDocumentos = new ArrayList<>();
        this.usuarioActivo = null;
        this.listaAccesos = new ArrayList<>();
    }

    public Paradigmadocs(String nombre, LocalDate fecha,
                         ArrayList<Usuario> listaUsuarios, ArrayList<Documento>
                                 listaDocumentos, String usuarioActivo, ArrayList<Acceso> listaAccesos) {
        this.nombre = nombre;
        this.fechaGdocs = fecha;
        this.listaUsuarios = listaUsuarios;
        this.listaDocumentos = listaDocumentos;
        this.usuarioActivo = usuarioActivo;
        this.listaAccesos = listaAccesos;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaGdocs() {
        return fechaGdocs;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Documento> getListaDocumentos() {
        return listaDocumentos;
    }

    public String getUsuarioActivo() {
        return usuarioActivo;
    }

    public ArrayList<Acceso> getListaAccesos() {
        return listaAccesos;
    }
}
