<%-- 
    Document   : TablaExp
    Created on : 28/10/2017, 06:27:56 PM
    Author     : mnieto
--%>

<%@page import="Dao.DaoUsuario"%>
<%@page import="Modelo.Experiencia"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<Experiencia> col= (ArrayList<Experiencia>) request.getAttribute("experiencias");
            Integer vtotal = (Integer) request.getAttribute("total");
            int total = 0;
            if (vtotal == null) {
                total = 0;
            } else {
                total = vtotal.intValue();
            }

        %>
        
        
         <form method="GET" action='ServletExp' name="frr">
                        <font color="white"><h2>HISTORIAL</h2></font>
                        <br>
                       
                            <table  width="400" border="2" align="center">
                                <caption align="top">
                                </caption>
                                <tr>
                                    <th width="84" scope="col"><strong><font >Nombre Experiencia</font></strong></th>
                                    <th width="84" scope="col"><strong><font >Curso</font></strong></th>
                                    <th width="84" scope="col"><strong><font >Aignatura</font></strong></th>
                                    <th width="84" scope="col"><strong><font >Tema</font></strong></th>
                                      <th width="84" scope="col"><strong><font >descripcion</font></strong></th>
                                    <th width="84" scope="col"><strong><font >Nombre Usuario</font></strong></th>
                                </tr>
                                <%    if (request.getAttribute("experiencias") != null) {
                                        ArrayList<Experiencia> esqq = (ArrayList<Experiencia>) request.getAttribute("experiencias");
                                      
                                       
                                        for (Experiencia e : esqq) {;
                                %>
                                <tr>
                                    <td><%= e.getNombreExp() %></td>
                                    <td><%= e.getCurso()%></td>
                                    <td><%= e.getAsignatura() %></td>
                                    
                                    <td><%= e.getTema() %></td>
                                    <td><%=e.getDescripcion()%></td>
                                    <td><%=e.getIdUser().getNombreUser() %></td>
                                </tr>
                                <%
                                        }
                                    }
                                %>
                            </table>
                                 <input type="submit" VALUE ="HISTORIAL"/><br/>  
                
         </form>
        <h1>Hello World!</h1>
    </body>
</html>
