package examen1p2_adrianburgos;
import java.util.ArrayList;

public class Servicios {
    private String nombre;
    private double mensualidad;
    private String calificacion;
    private String fecha;
    private String empresa;
    private ArrayList contenido;

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
    
}
