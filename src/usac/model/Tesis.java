package usac.model;

import usac.Estado;

public class Tesis extends Documento {
    private String area;

    public Tesis(String autor, String titulo, String palabra_clave, String temas, String descripcion,String area, Integer edicion, Integer copias, Integer disponibles, Estado estado) {
        super(autor, titulo, palabra_clave, temas, descripcion, edicion, copias, disponibles, estado);
        this.area=area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
                ", estado=" + estado +
                '}';
    }
}
