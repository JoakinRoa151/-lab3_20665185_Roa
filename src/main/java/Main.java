import TDAs.Paradigmadocs;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("sickLucho151\n");
        LocalDate auxFecha = LocalDate.now();

        Paradigmadocs gDocs0 = new Paradigmadocs("gDocs0",auxFecha);

        System.out.println("### EDITOR COLABORATIVO ###\n" +
                "## Registrado como: User123 ##\n" +
                "Escoja su opción:\n" +
                "1. Crear nuevo documento\n" +
                "2. Compartir documento\n" +
                "3. Agregar contenido a un documento\n" +
                "4. Restaurar versión de un documento\n" +
                "5. Revocar acceso a un documento\n" +
                "6. Buscar en los documentos\n" +
                "7. Visualizar documentos\n" +
                "8. Cerrar sesión\n" +
                "9. Cerrar el programa\n" +
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