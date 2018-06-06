package co.com.poli.proyecto_prueba.controller;

import co.com.poli.proyecto_prueba.Bussines.Implementation.UsuarioBussinesImpl;
import co.com.poli.proyecto_prueba.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Luisa
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        HttpSession session = request.getSession(true);
        RequestDispatcher rd = null;

        UsuarioBussinesImpl uBusinessImpl = new UsuarioBussinesImpl();
        String accion = request.getParameter("accion");

        switch (accion) {
            case "crear":
                Boolean Estado = false;

                String doc = request.getParameter("txtdocumento");
                String nombre = request.getParameter("txtnombre");
                String apellido = request.getParameter("txtapellido");
                String email = request.getParameter("txtemail");
                String clave = request.getParameter("txtclave");
                String rol = request.getParameter("txtrol");
                String estado = request.getParameter("txtestado");
                
                if(estado.equals("activo"))
                {
                    Estado= true;
                }
                Usuario usuario = new Usuario(doc, nombre, apellido, email, clave, rol, Estado);
                                
                String msj = uBusinessImpl.crearUsuario(usuario);
                session.setAttribute("MENSAJE", msj);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                
                break;

            case "listar":
                List<Usuario> listaUsuarios = uBusinessImpl.ObtenerListaUsuario();
                session.setAttribute("LISTADO", listaUsuarios);
                rd = request.getRequestDispatcher("/view/usuarioLista.jsp");
                break;
            default:
                break;
        }
       rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
