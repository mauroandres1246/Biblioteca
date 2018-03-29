package usac.model;

public class Libro extends Documento {

    public Libro(String autor, String titulo, String palabra_clave, String temas, String descripcion, Integer edicion, Integer copias, Integer disponibles) {
        super(autor, titulo, palabra_clave, temas, descripcion, edicion, copias, disponibles);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
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
