package examen1p2_adrianburgos;
import java.util.ArrayList;
import java.util.Scanner;

public class Examen1P2_AdrianBurgos extends Gui {

    static Scanner scan = new Scanner(System.in);
    static ArrayList <Usuarios> listausuarios = new ArrayList();
    static ArrayList listaservicios = new ArrayList();

    public static void main(String[] args) {
        Usuarios t = new Usuarios("david", "1234");
        listausuarios.add(t);
        
        int opcion = 0;
        while (opcion != 3) {
            System.out.println();
            System.out.print("=========Menu=========\n"
                    + "1. Login\n"
                    + "2. Registrarse\n"
                    + "3. Salir\n"
                    + "Ingrese Opcion: ");
            opcion = scan.nextInt();
            System.out.println();

            switch (opcion) {
                case 1: {
                    System.out.println("=====Login=====");
                    System.out.print("Usuario: ");
                    String borrador = scan.nextLine();
                    String usuario = scan.nextLine();
                    System.out.print("Contraseña: ");
                    String pass = scan.nextLine();
                    login(usuario, pass);
                    break;
                }
                case 2: {
                    System.out.println("=====Registrarse=====");
                    System.out.print("Ingrese usuario: ");
                    String borrador = scan.nextLine();
                    String user = scan.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    String password = scan.nextLine();
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scan.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    String apellido = scan.nextLine();
                    System.out.print("Ingrese su correo: ");
                    String correo = scan.nextLine();
                    System.out.print("Ingrese su numero: ");
                    int numero = scan.nextInt();
                    System.out.print("Ingrese su plan: ");
                    borrador = scan.nextLine();
                    String plan = scan.nextLine();
                    Usuarios u = new Usuarios(user, password, nombre, apellido, correo, numero, plan);
                    listausuarios.add(u);
                    break;
                }
            }
        }
    }

    public static void login(String user, String pass) {
        boolean error = false;
        for (int i = 0; i < listausuarios.size(); i++) {
            if (user.equals("david")
                    && pass.equals("1234")) {
                System.out.println("david");
                error = true;
                break;
            } 
            else if (listausuarios.get(i).getUser().equals(user)
                    && listausuarios.get(i).getPassword().equals(pass)) {
                System.out.println("hola");
                error = true;
            }
        }
        if(error == false) {
            System.out.println("Usuario o contraseña incorrecta");
        }
    }
}
