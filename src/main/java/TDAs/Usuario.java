package TDAs;
import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String contrasenia;
    private LocalDate fechaIngreso;
    private int ID;

    LocalDate fecha= LocalDate.now();

    public Usuario(String nombre, String contrasenia, LocalDate fecha, int ID) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.fechaIngreso = fecha;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public int getID() {
        return ID;
    }
}
