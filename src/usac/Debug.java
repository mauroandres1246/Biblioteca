package usac;

import usac.model.Documento;
import usac.model.Libro;
import usac.model.Revista;
import usac.model.Tesis;

import java.util.Vector;

public class Debug {
    Vector<Documento> baseDeDatos = BaseDeDatos.baseDeDatos;

    public Debug() {
        Libro libro =  new Libro("Autor Libro","Titulo Libro",
                "Palabra Clave Libro",
                "Temas Libro",
                "Descripcion Libro",
                9,9,9,Estado.ACTIVO);


        Revista revista =  new Revista("AutorRevista","TituloRevista",
                "Revista",
                "Revista Temas",
                "Revista Descripcion",
                "Revista Frecuencia Actual",10,10,10,10,Estado.ACTIVO);

        Tesis tesis = new Tesis("Autor Tesis","Titulo Tesis",
                "Tesis",
                "Tesis Temas",
                "Tesis Descripcion",
                "Area Tesis",11,11,11,Estado.ACTIVO);

        baseDeDatos.add(libro);
        baseDeDatos.add(revista);
        baseDeDatos.add(tesis);

        for (Documento doc: baseDeDatos) {
            System.out.println(doc);
        }

    }



}
