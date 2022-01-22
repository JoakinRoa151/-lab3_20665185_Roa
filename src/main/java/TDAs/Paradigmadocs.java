package TDAs;
import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;


public class Paradigmadocs {
    private String nombre;
    private LocalDate fechaGdocs;
    private ArrayList<Usuario> usuarios;
    private ArrayList<ArrayList<Documento>> documentos;
    private String usuarioActivo;
    private ArrayList<Acceso> accesos;

    //LocalDate fecha = LocalDate.now();
    // Constructores Paradigmadocs
    public Paradigmadocs(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaGdocs = fechaCreacion;
        this.usuarios = new ArrayList<>();
        this.documentos = new ArrayList<>();
        this.usuarioActivo = null;
        this.accesos = new ArrayList<>();
    }

    public Paradigmadocs(String nombre, LocalDate fecha,
                         ArrayList<Usuario> usuarios, ArrayList<ArrayList<Documento>>
                                 documentos, String usuarioActivo, ArrayList<Acceso> accesos) {
        this.nombre = nombre;
        this.fechaGdocs = fecha;
        this.usuarios = usuarios;
        this.documentos = documentos;
        this.usuarioActivo = usuarioActivo;
        this.accesos = accesos;
    }

    // Getters Paradigmadocs
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaGdocs() {
        return fechaGdocs;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<ArrayList<Documento>> getDocumentos() {
        return documentos;
    }

    public String getUsuarioActivo() {
        return usuarioActivo;
    }

    public ArrayList<Acceso> getAccesos() {
        return accesos;
    }

    // ---------------- Register ---------------- //
    public void Register(String nombreUsuario, String clave) {
        LocalDate fechaRegistro = LocalDate.now();
        int nuevoID = (this.usuarios.size()) + 1;
        Usuario nuevoUsuario = new Usuario(nombreUsuario, clave, fechaRegistro, nuevoID);
        if (nuevoUsuario.verificarUsuarioExistente(this.usuarios, nombreUsuario)) {
            this.usuarios.add(nuevoUsuario);
        } else {
            System.out.println("NOMBRE DE USUARIO EXISTENTE, INGRESE UNO DISTINTO!\n");
        }
    }

    // ---------------- Login ---------------- //
    public void Login(String nombreUsuario, String clave) {
        LocalDate fechaIngreso = LocalDate.now();
        Usuario usuarioLogeado = new Usuario(nombreUsuario, clave);
        if (usuarioLogeado.verificarIngresoUsuario(this.usuarios, nombreUsuario, clave)) {
            this.usuarioActivo = nombreUsuario;
        } else {
            System.out.println("NOMBRE O CONTRASEÑA INCORRECTA!, PORFAVOR INTENTE NUEVAMENTE!\n");
        }
    }


    // ---------------- LogOut ---------------- //
    public void LogOut(String nombreUsuario, String clave) {
        this.usuarioActivo = null;
    }

    // ---------------- Create ---------------- //
    public void Create(String nombreDocumento, String contenido) {
        if (this.usuarioActivo != null) {
            LocalDate fechaCreacion = LocalDate.now();
            int nuevoID = (this.documentos.size()) + 1;
            Documento nuevoDocumento = new Documento(this.usuarioActivo,nuevoID,0,nombreDocumento,contenido,fechaCreacion);
            ArrayList<Documento> nuevaListaVersiones= new ArrayList<>();
            nuevaListaVersiones.add(nuevoDocumento);
            this.documentos.add(nuevaListaVersiones);
        }
        else {
            System.out.println("PORFAVOR INICIE SESION ANTES DE CREAR UN DOCUMENTO!\n");
        }
    }





}
