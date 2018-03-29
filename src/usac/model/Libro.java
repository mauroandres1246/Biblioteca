package usac.model;

import usac.Estado;

public class Libro extends Documento {


    public Libro(String autor, String titulo, String descripcion, Integer edicion, Integer copias, Integer disponibles, String[] palabra_claves, String[] temas) {
        super(autor, titulo, descripcion, edicion, copias, disponibles, palabra_claves, temas);
    }
}
