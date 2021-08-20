package examen1p2_adrianburgos;
import java.util.ArrayList;
import java.util.Scanner;

public class Examen1P2_AdrianBurgos {

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
                cliente(i);
                error = true;
            }
        }
        if(error == false) {
            System.out.println("Usuario o contraseña incorrecta");
        }
    }
    
    public static void cliente(int index) {
        int opcion = 0;
        while (opcion != 4) {
        System.out.println();
            System.out.print("======Sub-Menu======\n"
                    + "1. Ver servicios de streaming\n"
                    + "2. Ver los servicios a los que me he suscrito\n"
                    + "3. Modificar mi informacion\n"
                    + "4. Logout\n"
                    + "Ingrese Opcion: ");
            opcion = scan.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1: {
                    System.out.println();
                    for (int i = 0; i < listaservicios.size(); i++) {
                        System.out.print(i+") "+listaservicios.get(i));
                        System.out.println();
                        System.out.print("Ingrese index del servicio al que desea suscribirse: ");
                        int num = scan.nextInt();
                        listausuarios.get(index).getSuscripciones().add(((Servicios)listaservicios.get(index)).getNombre());
                    }
                    break;
                }
                case 2: {
                    System.out.println("Usted esta suscrito a los siguientes servicios: "+((Usuarios)listausuarios.get(index)).getSuscripciones());
                    break;
                }
                case 3: {
                    System.out.print("Ingrese nuevo nombre: ");
                    String x = scan.nextLine();
                    ((Usuarios)listausuarios.get(index)).setNombre(scan.nextLine());
                    System.out.print("Ingrese nuevo apellido: ");
                    ((Usuarios)listausuarios.get(index)).setApellido(scan.nextLine());
                    System.out.print("Ingrese nuevo correo: ");
                    ((Usuarios)listausuarios.get(index)).setCorreo(scan.nextLine());
                    System.out.print("Ingrese nuevo plan: ");
                    ((Usuarios)listausuarios.get(index)).setPlan(scan.nextLine());
                    System.out.print("Ingrese nuevo numero: ");
                    ((Usuarios)listausuarios.get(index)).setNumero(scan.nextInt());
                    break;
                }
                case 4: {
                }
                default: System.out.println("Opcion invalida");
            }
        }
    }
    
    public static void david(int index) {
        System.out.println();
            System.out.print("======Sub-Menu======\n"
                    + "1. Agregar servicio\n"
                    + "2. Modifcar servicio\n"
                    + "3. Eliminar servicio\n"
                    + "4. Salir\n"
                    + "Ingrese Opcion: ");
            int opcion = scan.nextInt();
            System.out.println();
    }
    
    public static ArrayList getServicios() {
        return listaservicios;
    }
    public static void setServicios(ArrayList lista) {
        listausuarios = lista;
    }
}
