package usac;

import usac.model.Usuario;

public class MainApp {
    public static void main(String[] args) {
        Usuario administrador = new Usuario("admin","admin",TipoDeUsuario.ADMINISTRADOR);
        BaseDeDatos.usuarios.add(administrador);
        Debug debug = new Debug();
    }
}
