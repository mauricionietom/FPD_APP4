/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Dao.Dao;
import Dao.DaoComentario;
import Dao.DaoExperiencia;
import Dao.DaoUsuario;
import Modelo.Comentario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ServletComentario extends HttpServlet {

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
        

        String descrpcion = request.getParameter("des");
        String exp = request.getParameter("Expere");
        System.out.println("llllllllllllllll----------------"+exp);
        
       HttpSession session = request.getSession();
       String usuarioExt = session.getAttribute("idUser").toString();
       
       
        Dao dCom;
        
//        try{
//            DaoComentario dc = new DaoComentario();
//            DaoUsuario du= new DaoUsuario();
//            DaoExperiencia de=new DaoExperiencia();
//            dCom = new Dao();
//            Comentario com = new Comentario();
//            
//          com.setIdCom(dCom.idgenerado());
//          com.setDescripcion(descrpcion);
//          com.setIdUser(du.objetoUsario(Integer.parseInt(usuarioExt)));
//          //com.getIdExp(de.objetoExperiencia())
//          
//         
//          boolean r=dc.insertar(com);
//            
//           
//        } catch (SQLException ex) {
//            Logger.getLogger(ServletComentario.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ServletComentario.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(ServletComentario.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(ServletComentario.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
