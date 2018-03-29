package usac.model;

import usac.Estado;

public abstract class Documento {
     String autor,titulo,palabra_clave,temas,descripcion;
     Integer edicion,copias,disponibles;
     Estado estado;

    public Documento(String autor, String titulo, String palabra_clave,
              String temas, String descripcion, Integer edicion,
              Integer copias, Integer disponibles, Estado estado) {
        this.autor = autor;
        this.titulo = titulo;
        this.palabra_clave = palabra_clave;
        this.temas = temas;
        this.descripcion = descripcion;
        this.edicion = edicion;
        this.copias = copias;
        this.disponibles = disponibles;
        this.estado = estado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPalabra_clave() {
        return palabra_clave;
    }

    public void setPalabra_clave(String palabra_clave) {
        this.palabra_clave = palabra_clave;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public void setEdicion(Integer edicion) {
        this.edicion = edicion;
    }

    public Integer getCopias() {
        return copias;
    }

    public void setCopias(Integer copias) {
        this.copias = copias;
    }

    public Integer getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(Integer disponibles) {
        this.disponibles = disponibles;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
