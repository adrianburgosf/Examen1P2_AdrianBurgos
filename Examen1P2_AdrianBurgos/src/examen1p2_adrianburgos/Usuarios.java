package examen1p2_adrianburgos;
import java.util.ArrayList;

public class Usuarios {
    private String user;
    private String password;
    private String nombre;
    private String apellido;
    private String correo;
    private int numero;
    private String plan;
    private ArrayList <Servicios> suscripciones;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public ArrayList<Servicios> getSuscripciones() {
        return suscripciones;
    }

    public void setSuscripciones(ArrayList<Servicios> suscripciones) {
        this.suscripciones = suscripciones;
    }
}
