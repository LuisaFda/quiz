package co.com.poli.proyecto_prueba.Bussines;

import co.com.poli.proyecto_prueba.model.Usuario;
import java.util.List;

public interface IUsuarioBussines 
{
    List<Usuario> ObtenerListaUsuario();
    Usuario ObtenerUsuario(String NroDocumento);
    String crearUsuario(Usuario usuario);
    String modificarUsuario(Usuario usuario);
    String eliminarUsuario(String NroDocumento);
}
