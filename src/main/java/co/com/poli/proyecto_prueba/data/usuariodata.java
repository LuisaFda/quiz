package co.com.poli.proyecto_prueba.data;


import co.com.poli.proyecto_prueba.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class usuariodata
{
    //Cosntructor especial
    private static List<Usuario> listUsuario;
    
    static
    {
        listUsuario = new ArrayList<Usuario>()
        {
            {
                add(new Usuario("123","Luisa","Tangarife","luisa@mail.com","1234","admin",false));
                add(new Usuario("456","Catalina","Montoya","cata@mail.com","1234","admin",false));
                add(new Usuario("789","Pepito","Perez","pepito@mail.com","1234","admin",false));
            }
        };
        
    }

    public static List<Usuario> getListUsuario()
    {
        return listUsuario;
    }

    public static void setListUsuario(List<Usuario> listUsuario) 
    {
        usuariodata.listUsuario = listUsuario;
    }
    
}
