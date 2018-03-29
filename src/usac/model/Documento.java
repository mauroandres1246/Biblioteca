package usac.model;

public abstract class Documento {
    String autor,titulo,palabra_clave,temas,descripcion;
    Integer edicion,copias,disponibles;

    public Documento(String autor, String titulo, String palabra_clave, String temas, String descripcion, Integer edicion, Integer copias, Integer disponibles) {
        this.autor = autor;
        this.titulo = titulo;
        this.palabra_clave = palabra_clave;
        this.temas = temas;
        this.descripcion = descripcion;
        this.edicion = edicion;
        this.copias = copias;
        this.disponibles = disponibles;
    }
}
