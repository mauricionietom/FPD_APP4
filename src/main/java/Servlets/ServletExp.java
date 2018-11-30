package Servlets;

import Dao.Dao;
import Dao.DaoAlbum;
import Dao.DaoAlbumSencillo;
import Dao.DaoExperiencia;
import Dao.DaoInterprete;
import Dao.DaoInterpreteAlbum;
import Dao.DaoSencillo;
import Dao.DaoUsuario;
import Modelo.Album;
import Modelo.AlbumSencillo;
import Modelo.Experiencia;
import Modelo.Interprete;
import Modelo.InterpreteAlbum;
import Modelo.Sencillo;
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombreAlbum = request.getParameter("nombreAlbum");
        String nombreArtista = request.getParameter("nombreArtista");
        String cancionUno = request.getParameter("cancionUno");
        String cancionDos = request.getParameter("cancionDos");
        String cancionTres = request.getParameter("cancionTres");
        String cancionCuatro = request.getParameter("canconCuatro");
        String cancionCinco = request.getParameter("cancionCinco");
        
        System.out.println(nombreAlbum+"-------------");
        try {
            //DAO
            DaoAlbum Dalb = new DaoAlbum();
            DaoInterprete daoInt = new DaoInterprete();
            DaoInterpreteAlbum daosen = new DaoInterpreteAlbum();
            DaoAlbumSencillo DalbSen = new DaoAlbumSencillo();
            DaoSencillo DSen = new DaoSencillo();

            //OBJETOS
            Interprete inter = new Interprete();
            Album alb = new Album();
            InterpreteAlbum album2 = new InterpreteAlbum();
            AlbumSencillo albumsenc = new AlbumSencillo();
            AlbumSencillo albumsenci = new AlbumSencillo();
            AlbumSencillo albumsencil = new AlbumSencillo();
             AlbumSencillo albumsencill = new AlbumSencillo();
             AlbumSencillo albumsencillo = new AlbumSencillo();
            Sencillo senci = new Sencillo();
            Sencillo senci1 = new Sencillo();
            Sencillo senci2 = new Sencillo();
            Sencillo senci3 = new Sencillo();
            Sencillo senci4 = new Sencillo();
            //Enviar datos

            alb.setNombreAlbum(nombreAlbum);
            inter.setNombreArtista(nombreArtista);
            senci.setTitulo(cancionUno);
            senci1.setTitulo(cancionDos);
            senci2.setTitulo(cancionTres);
            senci3.setTitulo(cancionCuatro);
            senci4.setTitulo(cancionCinco);
            
                      //PEDIR OBJETOS
            Album album = Dalb.objetoAlbum(nombreAlbum);
            Interprete interpp = daoInt.objetoInterprete(nombreArtista);
            album2.setIdAlbum(album.getIdAlbum());
            album2.setIdInterprete(inter.getIdInterprete());
            Sencillo s = DSen.objetoSenciilo(cancionUno);
            Sencillo si = DSen.objetoSenciilo(cancionDos);
            Sencillo sii = DSen.objetoSenciilo(cancionTres);
            Sencillo siii = DSen.objetoSenciilo(cancionCuatro);
            Sencillo siiii = DSen.objetoSenciilo(cancionCinco);
            
            albumsenc.setIdAlbum(album.getIdAlbum());
            albumsenc.setIdSencillo(s.getIdSencillo());
            
            albumsenci.setIdSencillo(s.getIdSencillo());
            albumsenci.setIdAlbum(album.getIdAlbum());
            
            albumsencil.setIdAlbum(album.getIdAlbum());
            albumsencil.setIdSencillo(s.getIdSencillo());
            
            albumsencill.setIdSencillo(s.getIdSencillo());
            albumsencill.setIdAlbum(album.getIdAlbum());
            
            albumsencillo.setIdSencillo(s.getIdSencillo());
            albumsencillo.setIdAlbum(album.getIdAlbum());
            
            DalbSen.insertar(albumsenc);
            DalbSen.insertar(albumsenci);
            DalbSen.insertar(albumsencil);
            DalbSen.insertar(albumsencill);
            DalbSen.insertar(albumsencillo);
            
            
           
            boolean rta = daosen.insertar(album2);

            if (rta == false) {
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
