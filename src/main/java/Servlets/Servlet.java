/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Dao.DaoComentario;
import Dao.DaoExperiencia;
import Dao.DaoUsuario;
import Modelo.Comentario;
import Modelo.Experiencia;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet extends HttpServlet {

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
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idExp = request.getParameter("idExpere");
        DaoExperiencia de;
        response.getWriter().print("<p> la variales vale" + idExp + "</p>");

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

        String descripcion = request.getParameter("descripcion");
        String idExp = request.getParameter("idExpere");

        System.out.println(descripcion + "_______________________________________" + idExp + "______________________________________");

        HttpSession session = request.getSession();
        String usuario = session.getAttribute("idGuardado").toString();

        System.out.println(usuario + "hptaaaaaaaaaaaaaaaaaaaaa");

        

        try {
            DaoComentario dCom=new DaoComentario();
            Comentario co = new Comentario();

            dCom = new DaoComentario();

            co.setDescripcion(descripcion);
            co.setIdExp(Integer.parseInt(idExp));
            co.setIdUser(Integer.parseInt(usuario));

            boolean rta = dCom.insertar(co);
            if (rta == false) {
                RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("TablaExp.jsp");
                rd.forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
