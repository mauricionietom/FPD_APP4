/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Dao.DaoUsuario;
import Modelo.Usuario;
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

public class ServletLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String pswd = request.getParameter("pswd");
        
          HttpSession session = request.getSession();

          Usuario usr=new Usuario();
        DaoUsuario dao;
        try {
            dao = new DaoUsuario();
           
            if (email != " " && email != null) {
                 int rta = dao.autenticar(email, pswd);
                session.setAttribute("usuarioGuardado", email);
                usr= dao.objetoUsuarioEmail(email);
                session.setAttribute("idGuardado", usr.getIdUser());
                
                 if (rta==1)  {
                 
                 RequestDispatcher rd = request.getRequestDispatcher("Servicio.jsp");
                rd.forward(request, response);
                 }
                  if (rta == 2) {
                RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
                rd.forward(request, response);
            }

            }

               
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ServletLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ServletLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ServletLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
