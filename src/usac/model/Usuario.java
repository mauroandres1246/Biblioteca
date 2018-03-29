package usac.model;

import usac.TipoDeUsuario;

public class Usuario {
    private String username;
    private String password;
    private TipoDeUsuario tipoDeUsuario;

    public Usuario(String username, String password, TipoDeUsuario tipoDeUsuario) {
        this.username = username;
        this.password = password;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoDeUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
