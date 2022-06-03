import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Impresora impres = new Impresora("Lol");
	    boolean salir = false;

        Scanner sc = new Scanner(System.in);
        String opcionUsuario = "";

        while (!salir) {
            System.out.println("1.Encender impresora");
            System.out.println("2.Apagar impresora.");
            System.out.println("3.Añadir trabajo");
            System.out.println("4.Ver lista de trabajos");
            System.out.println("5.Imprimir");
            System.out.println("Q- Salir");

            opcionUsuario = sc.nextLine();

            switch (opcionUsuario) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":
                    System.out.println("El nombre de tu trabajo es: ");
                    String nombre = sc.nextLine();
                    System.out.println("El tamaño de tu trabajo es: ");
                    String tamaño = sc.nextLine();
                    impres.addDocumento(nombre,tamaño);
                    break;
                case "4":
                    impres.mostrar();
                    break;
                case "5":
                    impres.eliminarDocumentos();
                    break;
                case "Q":
                    System.out.println("Saliendo de la aplicación...");
                    salir = true;
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
                    break;
            }
        }
    }
}
