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
    // ---------------- Funciones Aux ----------- //
    public boolean verificarAccesoEdicion(String nombreUsuario, int idDocumento){
        for(int i=0;i<this.accesos.size();i++){
            if(this.accesos.get(i).getIdDocumento()==idDocumento){
                boolean existeUsuario = this.accesos.get(i).getNombresUsuarios().contains(nombreUsuario);
                boolean existePermiso = this.accesos.get(i).getPermiso().contains("W");
                if(existeUsuario && existePermiso){
                    return true;
                }
                else{
                    return false;
                }
            }
        }

        return false;
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
    public void LogOut() {
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

    // ---------------- Share ---------------- //
    public void Share(ArrayList<String> nombresUsuarios,int idDocumento, String permiso){
        if (this.usuarioActivo != null) {
           String propietarioDocumento= this.documentos.get(idDocumento-1).get(0).getUsuarioPropietario();
            if(this.usuarioActivo.equals(propietarioDocumento)){
               Acceso nuevoAcceso = new Acceso(idDocumento,nombresUsuarios,permiso);
               this.accesos.add(nuevoAcceso);
           }
            else{
                System.out.println("DEBE SER PROPIETARIO DEL DOCUMENTO PARA COMPARTIRLO!\n");
            }
        }
        else {
            System.out.println("PORFAVOR INICIE SESION ANTES DE COMPARTIR UN DOCUMENTO!\n");
        }

    }
    // ---------------- Add ---------------- //
    public void Add(int idDocumento, String contenidoAdicional){
        if(this.usuarioActivo != null) {
            String propietarioDocumento= this.documentos.get(idDocumento-1).get(0).getUsuarioPropietario();
            if((this.usuarioActivo.equals(propietarioDocumento)) ||(this.verificarAccesoEdicion(this.usuarioActivo,idDocumento))){
                LocalDate fechaEdicion = LocalDate.now();
                int posicionUltimaVersion= (this.documentos.get(idDocumento-1).size())-1;
                String nombreDocumento= this.documentos.get(idDocumento-1).get(posicionUltimaVersion).getNombreDocumento();
                String contenidoDocumento= this.documentos.get(idDocumento-1).get(posicionUltimaVersion).getContenido();
                String usuarioPropietario= this.documentos.get(idDocumento-1).get(posicionUltimaVersion).getUsuarioPropietario();
                int idNuevaVersion= posicionUltimaVersion+1;
                Documento nuevaVersion = new Documento(usuarioPropietario,idDocumento,idNuevaVersion,nombreDocumento,contenidoDocumento + contenidoAdicional
                        , fechaEdicion);
                this.documentos.get(idDocumento-1).add(nuevaVersion);
            }

        }
        else {
            System.out.println("PORFAVOR INICIE SESION ANTES DE EDITAR UN DOCUMENTO!\n");
        }
    }
}
