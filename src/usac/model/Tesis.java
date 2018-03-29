package usac.model;

import usac.Estado;

public class Tesis extends Documento {
    private String area;

    public Tesis(String autor, String titulo, String descripcion, Integer edicion, Integer copias, Integer disponibles, String[] palabra_claves, String[] temas) {
        super(autor, titulo, descripcion, edicion, copias, disponibles, palabra_claves, temas);
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


}
