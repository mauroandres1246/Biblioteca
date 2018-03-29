package usac.model;

import usac.Estado;

public class Revista extends Documento {
    private String frecuencia_actual;
    private Integer no_ejemplar;

    public Revista(String autor, String titulo, String descripcion, Integer edicion, Integer copias, Integer disponibles, String[] palabra_claves, String[] temas) {
        super(autor, titulo, descripcion, edicion, copias, disponibles, palabra_claves, temas);
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


}
