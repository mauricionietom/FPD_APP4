
package Servlets;

import Dao.Dao;
import Dao.DaoUsuario;
import Modelo.Experiencia;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ServletExp extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         ArrayList<Experiencia> lista = null;
        Dao de;

        try {
            de = new Dao();
            lista = de.getExperiencia();

            request.setAttribute("experiencias", lista);

            RequestDispatcher rd = request.getRequestDispatcher("TablaExp.jsp");
            rd.forward(request, response);
            
    }   catch (SQLException ex) {
            Logger.getLogger(ServletExp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletExp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ServletExp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ServletExp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombreExp = request.getParameter("nombreExp");
        String curso = request.getParameter("curso");
        String asignatura = request.getParameter("asig");
        String tema = request.getParameter("tema");
        String descripcion = request.getParameter("d");

        //HttpSession session = request.getSession();
        //String usuario = session.getAttribute("idUser").toString();
        String usuario="1";
        Dao dExp;
      
        try {
            DaoUsuario du= new DaoUsuario();
            dExp = new Dao();
            Experiencia exp = new Experiencia();
            exp.setIdExp(dExp.idgenerado());
            exp.setNombreExp(nombreExp);
            exp.setCurso(Integer.parseInt(curso));
            exp.setAsignatura(asignatura);
            exp.setTema(tema);
            exp.setDescripcion(descripcion);
            exp.setIdUser(du.objetoUsario(Integer.parseInt(usuario)));
            boolean rta = dExp.insertar(exp);
            System.out.println("rat----------"+rta);
            if (rta==false) {
                RequestDispatcher rd = request.getRequestDispatcher("column.jsp");
                rd.forward(request, response);
            } else {
                 RequestDispatcher rd = request.getRequestDispatcher("TablaExp.jsp");
                rd.forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServletExp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletExp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ServletExp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ServletExp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
