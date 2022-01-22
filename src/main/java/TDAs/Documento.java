package TDAs;
import java.time.LocalDate;
import java.util.ArrayList;

public class Documento {
    private String usuarioPropietario;
    private int idDocumento;
    private int idVersion;
    private String nombreDocumento;
    private String contenido;
    private LocalDate fechaCreacion;

    //LocalDate fecha= LocalDate.now();

    public Documento(String usuarioPropietario, int idDocumento, int idVersion,
                     String nombreDocumento, String contenido, LocalDate fechaCreacion) {
        this.usuarioPropietario = usuarioPropietario;
        this.idDocumento = idDocumento;
        this.idVersion = idVersion;
        this.nombreDocumento = nombreDocumento;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioPropietario() {
        return usuarioPropietario;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public int getIdVersion() {
        return idVersion;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public String getContenido() {
        return contenido;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
}
