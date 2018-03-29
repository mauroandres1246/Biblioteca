package usac.model;

public class Tesis extends Documento {
    String area;
    public Tesis(String autor,
                 String titulo,
                 String palabra_clave,
                 String temas,
                 String descripcion,
                 String area,
                 Integer edicion,
                 Integer copias,
                 Integer disponibles) {
        super(autor, titulo, palabra_clave, temas, descripcion, edicion, copias, disponibles);
        this.area=area;
    }

    @Override
    public String toString() {
        return "Tesis{" +
                "area='" + area + '\'' +
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
