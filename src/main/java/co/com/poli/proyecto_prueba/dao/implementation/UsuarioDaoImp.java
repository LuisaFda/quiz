/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.proyecto_prueba.dao.implementation;

import co.com.poli.proyecto_prueba.dao.Iusuariodao;
import co.com.poli.proyecto_prueba.data.usuariodata;
import co.com.poli.proyecto_prueba.model.Usuario;
import java.util.List;

/**
 *
 * @author gfghfh
 */
public class UsuarioDaoImp implements Iusuariodao
{

    @Override
    public List<Usuario> ObtenerListaUsuario() 
    {
        return usuariodata.getListUsuario();
    }

    @Override
    public Usuario ObtenerUsuario(String NroDocumento)
    {
        Usuario usuario = null;
        for(Usuario item : usuariodata.getListUsuario())
        {
            if(item.getDocumento().equals(NroDocumento))
            {
                usuario = item;
                break;
            }
        }
        return usuario;
    }

    @Override
    public String crearUsuario(Usuario usuario)
    {
        List<Usuario> listaUsu = usuariodata.getListUsuario();
        listaUsu.add(usuario);
        usuariodata.setListUsuario(listaUsu);
        return "Usuario Creado";
    }

    @Override
    public String modificarUsuario(Usuario usuario) 
    {
        List<Usuario> listaUsu = usuariodata.getListUsuario();
        listaUsu.set(listaUsu.indexOf(usuario), usuario);
        usuariodata.setListUsuario(listaUsu);
        return "Usuario Modificado";
    }

    @Override
    public String eliminarUsuario(String NroDocumento) 
    {
        List<Usuario> listaUsu = usuariodata.getListUsuario();
        listaUsu.remove(ObtenerUsuario(NroDocumento));
        usuariodata.setListUsuario(listaUsu);
        return "Usuario Modificado";
    }   
}
