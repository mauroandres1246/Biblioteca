package usac;

import usac.model.Documento;
import usac.model.Libro;
import usac.model.Revista;
import usac.model.Tesis;

import java.util.Vector;

public class Debug {
    Vector<Documento> baseDeDatos = BaseDeDatos.bibliografias;

    public Debug() {
        alimentandoBiblioGrafias();

    }

    private void alimentandoBiblioGrafias() {


        for (Documento doc: baseDeDatos) {
            System.out.println(doc);
        }
    }

    private void cargaMasiva(){
        String cadena = "0; Autor1; Titulo1; Descripcion1; palabra1, palabra2; 2; tema1, tema2; ; ; ; 10; 2 ";
        cadena.trim();
        String [] valores = cadena.split(";");
        //VALORES
    }

    private TipoDeDocumento getTipoDeLibro(String cadena){
        if (cadena.equals("0")){
            return TipoDeDocumento.LIBRO;
        }else  if(cadena.equals("1")){
            return TipoDeDocumento.REVISTA;
        }else  if(cadena.equals("2")){
            return TipoDeDocumento.TESIS;
        }else {
            return null;
        }
    }


}
