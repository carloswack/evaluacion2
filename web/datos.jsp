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
                 <th>Nombre</th> 
                 <th>Apellido</th> 
                 <th>Edad</th> 
                 <th>Sexo</th> 
                 <th>Ciudad</th> 
                  <th>Telefono Fijo</th> 
                 <th>Telefono Celular</th> 
                 <th>Dirección Comercial</th> 
                 <th>Especialidad</th>
                   </tr>     
                   <c:forEach items="${servicio.veterinarios}" var="v">
                 <tr>
                     <td>${v.rut}</td>
                     <td>${v.nombre}</td>
                     <td>${v.apellido}</td>
                     <td>${v.edad}</td>
                     <td>${v.sexo}</td>
                     <td>${v.ciudad}</td>
                     <td>${v.telefFijo}</td>
                     <td>${v.telefCel}</td>
                     <td>${v.direccionComercial}</td>
                     <td>${v.especialidad}</td>
                </tr>   
                 </c:forEach>
                    </table>
          
</div>

<%@include file="templates/footer.jsp" %>