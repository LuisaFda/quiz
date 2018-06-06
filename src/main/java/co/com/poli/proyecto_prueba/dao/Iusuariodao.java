package co.com.poli.proyecto_prueba.dao;

import co.com.poli.proyecto_prueba.model.Usuario;
import java.util.List;

public interface Iusuariodao
{
    List<Usuario> ObtenerListaUsuario();
    Usuario ObtenerUsuario(String NroDocumento);
    String crearUsuario(Usuario usuario);
    String modificarUsuario(Usuario usuario);
    String eliminarUsuario(String NroDocumento);
    
}
