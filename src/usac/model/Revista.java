package usac.model;

public class Revista extends Documento {
    String frecuencia_actual;
    Integer no_ejemplar;
    public Revista(String autor,
                   String titulo,
                   String palabra_clave,
                   String temas,
                   String descripcion,
                   String frecuencia_actual,
                   Integer no_ejemplar ,
                   Integer edicion,
                   Integer copias,
                   Integer disponibles) {
        super(autor, titulo, palabra_clave, temas, descripcion, edicion, copias, disponibles);
        this.frecuencia_actual=frecuencia_actual;
        this.no_ejemplar=no_ejemplar;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "frecuencia_actual='" + frecuencia_actual + '\'' +
                ", no_ejemplar=" + no_ejemplar +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", palabra_clave='" + palabra_clave + '\'' +
                ", temas='" + temas + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", edicion=" + edicion +
                ", copias=" + copias +
                ", disponibles=" + disponibles +
                '}';
    }
}
