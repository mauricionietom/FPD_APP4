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
        <script src="Style/js/jquery-3.2.0.js" type="text/javascript"></script>
        <script src="Style/js/semantic.js" type="text/javascript"></script>
        <link rel="stylesheet" href="Style/css/semantic.css">
         <link rel="stylesheet" href="Style/css/semantic.min.css">
      
      
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
                                    <th width="84" scope="col"><strong><font >Ver</font></strong></th>
                                </tr>
                                <%    if (request.getAttribute("experiencias") != null) {
                                        ArrayList<Experiencia> esqq = (ArrayList<Experiencia>) request.getAttribute("experiencias");
                                      
                                       
                                        for (Experiencia e : esqq) {
                                            
                                        
                                %>
                                <tr>
                                    <td><%= e.getNombreExp() %></td>
                                    <td><%= e.getCurso()%></td>
                                    <td><%= e.getAsignatura() %></td>
                                    
                                    <td><%= e.getTema() %></td>
                                    <td><%=e.getDescripcion()%></td>
                                    <td><%=e.getIdUser().getNombreUser() %></td>
                                    

                                    <td><a href="Comentarios.jsp?idExp=<%=e.getIdExp()%>">Ver Experiencia </a> </td>
                                    <td><div class="ui vertical animated button" tabindex="0">
                                            <div class="hidden content"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">tienda</font></font></div>
                                            <div class="visible content">
                                                <i class="shop icon"></i>
                                            </div>
                                        </div><td/>
         </tr>
                                <%
                                        }
                                    }
                                %>
                            </table>
                                 <input type="submit" VALUE ="HISTORIAL"/><br/>  
                
         </form>
        <h1>Fundacion Pies Descalzos</h1>
    </body>
</html>
