import TDAs.Paradigmadocs;
import TDAs.Usuario;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("sickLucho151\n");
        LocalDate auxFecha = LocalDate.now();
        Paradigmadocs gDocs0 = new Paradigmadocs("gDocs0",auxFecha);
        gDocs0.Register("Mica Kordovero","Tib123");












        //System.out.println(gDocs0.getUsuarios().get(0).getID() + "\n");
        //gDocs0.Register("luchoSick","xd");
        //System.out.println(gDocs0.getUsuarios().get(1).getID() + "\n");
        System.out.println("### EDITOR COLABORATIVO ###\n" +
                "## No existe Usuario Logeado ##\n" +
                "Escoja su opción:\n" +
                "1. Registrar Usuario\n" +
                "2. Iniciar Sesion\n" +
                "3. Crear nuevo documento\n" +
                "4. Compartir documento\n" +
                "5. Agregar contenido a un documento\n" +
                "6. Restaurar versión de un documento\n" +
                "7. Revocar acceso a un documento\n" +
                "8. Buscar en los documentos\n" +
                "9. Visualizar documentos\n" +
                "10. Cerrar sesión\n" +
                "11. Cerrar el programa\n" +
                "INTRODUZCA SU OPCIÓN:");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();

        boolean continuacion = true;
        while(continuacion){
            if(opcion==1){

            }
            else if(opcion==2){

            }
            else if(opcion==3){

            }
            else if(opcion==4){

            }
            else if(opcion==5){

            }
            else if(opcion==6){

            }
            else if(opcion==7){

            }
            else if(opcion==8){

            }
            else if(opcion==9){

            }
            else if(opcion==10){

            }
            else if(opcion==11){
                continuacion=false;
            }
            else{
                System.out.println("OPCION INVALIDA!\n");
                System.out.println("INTRODUZCA SU OPCIÓN:");
                opcion = entrada.nextInt();
            }




        }




































    }
}