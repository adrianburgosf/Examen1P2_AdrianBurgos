package examen1p2_adrianburgos;

public class Miniseries {
    private String nombre;
    private int cantidadtemporadas;
    private String genero;
    private int duracion;
    private String plot;

    public Miniseries(String nombre, int cantidadtemporadas, String genero, int duracion, String plot) {
        this.nombre = nombre;
        this.cantidadtemporadas = cantidadtemporadas;
        this.genero = genero;
        this.duracion = duracion;
        this.plot = plot;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadtemporadas() {
        return cantidadtemporadas;
    }

    public void setCantidadtemporadas(int cantidadtemporadas) {
        this.cantidadtemporadas = cantidadtemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }
    
    @Override
    public String toString() {
        String servicios;
        return "Nombre: "+nombre+"\n"
                + "Temporadas: "+cantidadtemporadas+"\n"
                + "Genero: "+genero+"\n"
                + "Duracion de cada capitulo: "+duracion+"\n"
                + "Plot: "+plot+"\n";
    }
}
