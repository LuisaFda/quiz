/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.proyecto_prueba.Bussines.Implementation;

import co.com.poli.proyecto_prueba.Bussines.IUsuarioBussines;
import co.com.poli.proyecto_prueba.dao.implementation.UsuarioDaoImp;
import co.com.poli.proyecto_prueba.model.Usuario;
import java.util.List;

/**
 *
 * @author gfghfh
 */
public class UsuarioBussinesImpl implements IUsuarioBussines
{
    UsuarioDaoImp usuarioDao = new UsuarioDaoImp();

    @Override
    public List<Usuario> ObtenerListaUsuario() 
    {
        return usuarioDao.ObtenerListaUsuario();
    }

    @Override
    public Usuario ObtenerUsuario(String NroDocumento) 
    {
        return usuarioDao.ObtenerUsuario(NroDocumento);
    }

    @Override
    public String crearUsuario(Usuario usuario) 
    {
        String msj = "usuario ya existe";
        Usuario user = ObtenerUsuario(usuario.getDocumento());
        if(user != null)
        {
            msj = usuarioDao.crearUsuario(usuario);
        }
        return msj;
    }

    @Override
    public String modificarUsuario(Usuario usuario)
    {
    
        String msj = "Usuario no existe";
        Usuario user = ObtenerUsuario(usuario.getDocumento());
        if(user != null)
        {
            msj = usuarioDao.modificarUsuario(usuario);
        }
        return msj;
    }

    @Override
    public String eliminarUsuario(String NroDocumento)
    {
        String msj = "Usuario no existe";
        Usuario user = ObtenerUsuario(NroDocumento);
        if(user != null)
        {
            msj = usuarioDao.eliminarUsuario(NroDocumento);
        }
        return msj;
    }
    
}