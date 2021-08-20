package examen1p2_adrianburgos;

public class Peliculas {
    private String nombre;
    private int duracion;
    private String estrenosalas;
    private String estrenostreaming;
    private String plot;

    public Peliculas(String nombre, int duracion, String estrenosalas, String estrenostreaming, String plot) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.estrenosalas = estrenosalas;
        this.estrenostreaming = estrenostreaming;
        this.plot = plot;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEstrenosalas() {
        return estrenosalas;
    }

    public void setEstrenosalas(String estrenosalas) {
        this.estrenosalas = estrenosalas;
    }

    public String getEstrenostreaming() {
        return estrenostreaming;
    }

    public void setEstrenostreaming(String estrenostreaming) {
        this.estrenostreaming = estrenostreaming;
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
                + "Duracion de la pelicula: "+duracion+"\n"
                + "Fecha de estreno en salas: "+estrenosalas+"\n"
                + "Fecha de estreno en streaming: "+estrenostreaming+"\n"
                + "Plot: "+plot+"\n";
    }
    
    
}
