package examen1p2_adrianburgos;
import java.util.ArrayList;

public class Servicios {
    private String nombre;
    private double mensualidad;
    private String calificacion;
    private String fecha;
    private String empresa;
    private ArrayList contenido = new ArrayList();

    public Servicios(String nombre, double mensualidad, String calificacion, String fecha, String empresa) {
        this.nombre = nombre;
        this.mensualidad = mensualidad;
        this.calificacion = calificacion;
        this.fecha = fecha;
        this.empresa = empresa;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList getContenido() {
        return contenido;
    }

    public void setContenido(ArrayList contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        String servicios;
        String tipodecontenido = "[";
        for (int i = 0; i < contenido.size(); i++) {
            tipodecontenido += contenido.get(i)+"\n";
        }
        tipodecontenido += "]";
        return "Nombre: "+nombre+"\n"
                + "Mensualidad: "+mensualidad+"\n"
                + "Calificacion: "+calificacion+"\n"
                + "Fecha: "+fecha+"\n"
                + "Empresa: "+empresa+"\n"
                + "Contenido:\n"+tipodecontenido;
    }
}
