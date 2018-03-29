package usac.model;

import usac.Estado;

public class Revista extends Documento {
    private String frecuencia_actual;
    private Integer no_ejemplar;
    public Revista(String autor,
                   String titulo,
                   String palabra_clave,
                   String temas,
                   String descripcion,
                   String frecuencia_actual,
                   Integer no_ejemplar ,
                   Integer edicion,
                   Integer copias,
                   Integer disponibles,
                   Estado estado) {
        super(autor, titulo, palabra_clave, temas, descripcion, edicion, copias, disponibles,estado);
        this.frecuencia_actual=frecuencia_actual;
        this.no_ejemplar=no_ejemplar;
    }

    public String getFrecuencia_actual() {
        return frecuencia_actual;
    }

    public void setFrecuencia_actual(String frecuencia_actual) {
        this.frecuencia_actual = frecuencia_actual;
    }

    public Integer getNo_ejemplar() {
        return no_ejemplar;
    }

    public void setNo_ejemplar(Integer no_ejemplar) {
        this.no_ejemplar = no_ejemplar;
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
                ", estado=" + estado +
                '}';
    }
}
