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
                david();
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
                        System.out.println();
                    }
                    System.out.print("Ingrese index del servicio al que desea suscribirse: ");
                    int num = scan.nextInt();
                    listausuarios.get(index).getSuscripciones().add(((Servicios)listaservicios.get(index)).getNombre());
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
                    break;
                }
                default: System.out.println("Opcion invalida");
            }
        }
    }
    
    public static void david() {
        int opcion = 0;
        while (opcion != 5) {
        System.out.println();
            System.out.print("==Bienvenido David==\n"
                    + "1. Agregar servicio\n"
                    + "2. Agregar contenido a un servicio\n"
                    + "3. Modificar servicio\n"
                    + "4. Eliminar servicio\n"
                    + "5. Logout\n"
                    + "Ingrese Opcion: ");
            opcion = scan.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1: {
                    System.out.print("Ingrese nombre: ");
                    String x = scan.nextLine();
                    String nombre = scan.nextLine();
                    System.out.print("Ingrese calificacion: ");
                    String calificacion = scan.nextLine();
                    System.out.print("Ingrese fecha: ");
                    String fecha = scan.nextLine();
                    System.out.print("Ingrese empresa: ");
                    String empresa = scan.nextLine();
                    System.out.print("Ingrese mensualidad: ");
                    double mensualidad = scan.nextDouble();
                    Servicios f = new Servicios(nombre, mensualidad, calificacion, fecha, empresa);
                    listaservicios.add(f);
                    break;
                }
                
                case 2: {
                    int opcion3 = 0;
                    System.out.print("Ingrese index del servicio al que desea agregarle contenido: ");
                    int index2 = scan.nextInt();
                    while (opcion3 != 4) {
                        System.out.println();
                        System.out.print("==Contenido==\n"
                                + "1. Añadir Serie\n"
                                + "2. Añadir Miniserie\n"
                                + "3. Añadir Pelicula\n"
                                + "4. Dejar de agregar contenido\n"
                                + "Ingrese Opcion: ");
                        opcion3 = scan.nextInt();
                        System.out.println();
                        contenidoagregar(opcion3, index2);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Ingrese index del servicio que desea modificar: ");
                    int subindex = scan.nextInt();
                    System.out.print("Ingrese nuevo nombre: ");
                    String x = scan.nextLine();
                    ((Servicios)listaservicios.get(subindex)).setNombre(scan.nextLine());
                    System.out.print("Ingrese nueva calificacion: ");
                    ((Servicios)listaservicios.get(subindex)).setCalificacion(scan.nextLine());
                    System.out.print("Ingrese nueva fecha: ");
                    ((Servicios)listaservicios.get(subindex)).setFecha(scan.nextLine());
                    System.out.print("Ingrese nueva empresa: ");
                    ((Servicios)listaservicios.get(subindex)).setEmpresa(scan.nextLine());
                    System.out.print("Ingrese nueva mensualidad: ");
                    ((Servicios)listaservicios.get(subindex)).setMensualidad(scan.nextDouble());
                    break;
                }
                case 4: {
                    System.out.print("Ingrese index del servicio que desea eliminar: ");
                    int index2 = scan.nextInt();
                    listaservicios.remove(index2);
                    break;
                }
                case 5: {
                    break;
                }
                default: System.out.println("Opcion invalida");
            }
        }
    }
    
    public static void contenidoagregar(int opcion, int index) {
        switch (opcion) {
            case 1: {
                System.out.print("Ingrese nombre: ");
                    String x = scan.nextLine();
                    String nombre = scan.nextLine();
                    System.out.print("Ingrese clasificacion por edad: ");
                    String clasificacion = scan.nextLine();
                    System.out.print("Ingrese año de estreno: ");
                    int estreno = scan.nextInt();
                    System.out.print("Ingrese cantidad de actores: ");
                    int actores = scan.nextInt();
                    System.out.print("Ingrese cantidad de temporadas: ");
                    int temporadas = scan.nextInt();
                    Series s = new Series (nombre, temporadas, clasificacion, estreno, actores);
                    ((Servicios)listaservicios.get(index)).getContenido().add(s);
                break;
            }
            case 2: {
                 System.out.print("Ingrese nombre: ");
                    String x = scan.nextLine();
                    String nombre = scan.nextLine();
                    System.out.print("Ingrese genero: ");
                    String genero = scan.nextLine();
                    System.out.print("Ingrese descripcion breve de la miniserie: ");
                    String plot = scan.nextLine();
                    System.out.print("Ingrese duracion de capitulos: ");
                    int duracion = scan.nextInt();
                    System.out.print("Ingrese cantidad de temporadas: ");
                    int temporadas = scan.nextInt();
                    Miniseries s = new Miniseries (nombre, temporadas, genero, duracion, plot);
                    ((Servicios)listaservicios.get(index)).getContenido().add(s);
                break;
            }
            case 3: {
                System.out.print("Ingrese nombre: ");
                    String x = scan.nextLine();
                    String nombre = scan.nextLine();
                    System.out.print("Ingrese fecha de estreno en salas: ");
                    String fechasa = scan.nextLine();
                    System.out.print("Ingrese fecha de estreno en streaming: ");
                    String fechast = scan.nextLine();
                    System.out.print("Ingrese una breve descripcion: ");
                    String plot= scan.nextLine();
                    System.out.print("Ingrese duracion de la pelicula en minutos: ");
                    int duracion = scan.nextInt();
                    Peliculas s = new Peliculas (nombre, duracion, fechasa, fechast, plot);
                    ((Servicios)listaservicios.get(index)).getContenido().add(s);
                break;
            }
            case 4: {
                break;
            }
            default: System.out.println("Opcion invalida");
        }
    }
}