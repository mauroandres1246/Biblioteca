package usac.model;

public abstract class Documento {
    String autor,titulo,descripcion;
    Integer edicion,copias,disponibles;
    String[] palabra_claves,temas;

    public Documento(String autor, String titulo, String descripcion, Integer edicion, Integer copias, Integer disponibles, String[] palabra_claves, String[] temas) {
        this.autor = autor;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.edicion = edicion;
        this.copias = copias;
        this.disponibles = disponibles;
        this.palabra_claves = palabra_claves;
        this.temas = temas;
    }
}
