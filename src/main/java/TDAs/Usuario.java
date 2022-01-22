package TDAs;
import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String clave;
    private LocalDate fechaIngreso;
    private int ID;

    //LocalDate fecha= LocalDate.now();

    // Constructores Usuario
    public Usuario(String nombre, String clave, LocalDate fecha, int ID) {
        this.nombre = nombre;
        this.clave = clave;
        this.fechaIngreso = fecha;
        this.ID = ID;
    }
    public Usuario(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;

    }
    // Getters Usuario
    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public int getID() {
        return ID;
    }
    // METODOS AUX //
    public boolean verificarUsuarioExistente(ArrayList<Usuario> usuarios, String nombreUsuarioNuevo){
        for(int i=0;i<usuarios.size();i++){
            if(nombreUsuarioNuevo.equals((usuarios.get(i).getNombre()))){
                return false;
            }
        }
        return true;
    }

    public boolean verificarIngresoUsuario(ArrayList<Usuario> usuarios, String nombreUsuarioIngresado, String claveIngresada){
        for(int i=0;i<usuarios.size();i++){
            if(nombreUsuarioIngresado.equals((usuarios.get(i).getNombre()))){
                if(claveIngresada.equals(usuarios.get(i).getClave())){
                    return true;

                }
                else{
                    return false;
                }
            }
        }
        return false;
    }


}
