<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="beans.ServicioLocal"%>
<%@page import="javax.naming.InitialContext"%>
<%! ServicioLocal servicio; %>
<%
     InitialContext ctx=new InitialContext();
    servicio=(ServicioLocal) ctx.lookup("java:global/Veterinaria/Servicio!beans.ServicioLocal");
    %>
<c:set var="servicio" scope="page" value="<%=servicio%>"/>

<%@include file="templates/header.jsp" %>
<%@include file="templates/menu.jsp" %>
<div class="row"
     <div class="col s6 offset-s3">
         <div class="card-panel">
             <table class="bordered highlight"
                    <tr>
                 <th>Rut Veterinario</th> 
                   </tr>     
                   <c:forEach items="${servicio.veterinarios}" var="v">
                 <tr>
                     <td>${v.rut}</td>
                </tr>   
                 </c:forEach>
                    </table>
            <table class="bordered highlight"
                <tr>
                 <th>ID Mascota</th>
                 <th>Nombre Mascota</th>
                 <th>Especie</th>
                 <th>Raza</th>
                 <th>Edad</th>
                 <th>Sexo</th>
                 <th>Fecha de Nacimiento</th>
                 
               </tr> 
                             
             <c:forEach items="${servicio.mascotas}" var="m">
                <tr> 
                     <td>${m.id}</td>
                     <td>${m.nombreMasc}</td>  
                     <td>${m.especie}</td> 
                     <td>${m.raza}</td>
                     <td>${m.edad}</td> 
                     <td>${m.sexo}</td>
                     <td>${m.fechaNac}</td>  
               </tr>
    
               </c:forEach>
        </table>
              <table class="bordered highlight"
                      <tr>
                       <th>Nombre Enfermedad</th>
                 <th>Descripcion</th>
                 <th>Tiempo Duracion</th>
                 <th>Tratamiento</th>  
                  </tr>
         <c:forEach items="${servicio.enfermedad}" var="e">
                <tr>                    
                     <td>${e.nombreEnf}</td>
                     <td>${e.descripcion}</td>  
                     <td>${e.tiempoDuracion}</td> 
                     <td>${e.tratamiento}</td>   
                </tr>
            </c:forEach>
           </table>
</div>

<%@include file="templates/footer.jsp" %>