package examen1p2_adrianburgos;

public class Series {
   private String nombre;
   private int cantidadtemporadas;
   private String clasificacion;
   private int estreno;
   private int actores;

    public Series(String nombre, int cantidadtemporadas, String clasificacion, int estreno, int actores) {
        this.nombre = nombre;
        this.cantidadtemporadas = cantidadtemporadas;
        this.clasificacion = clasificacion;
        this.estreno = estreno;
        this.actores = actores;
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

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public int getActores() {
        return actores;
    }

    public void setActores(int actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        String servicios;
        return "Nombre: "+nombre+"\n"
                + "Temporadas: "+cantidadtemporadas+"\n"
                + "Clasificacion: "+clasificacion+"\n"
                + "Año de estreno: "+estreno+"\n"
                + "Cantidad de actores: "+actores+"\n";
    }
   
   
}
