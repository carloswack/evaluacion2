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
             
             <form action="ingresar.do" method="post">
                 <div class="input-field">
                    <input name="rut" id="rut" type="text" class="validate">
                    <label for="rut">RUT</label>
                 </div>
                 <p class="center-align">Ingresar Mascota</p>
                 <div class="input-field">
                    <input name="id" id="id" type="text" class="validate">
                    <label for="id">ID Mascota</label>
                 </div>
                 <div class="input-field">
                    <input name="nombreMasc" id="nombreMasc" type="text" class="validate">
                    <label for="nombreMasc">Nombre</label>
                 </div>
                 <div class="input-field">
                    <input name="especie" id="especie" type="text" class="validate">
                    <label for="especie">Especie</label>
                 </div>
                 <div class="input-field">
                    <input name="raza" id="raza" type="text" class="validate">
                    <label for="raza">Raza</label>
                 </div>
                 <div class="input-field">
                    <input name="edad" id="precio" type="number" class="validate">
                    <label for="edad">Edad</label>
                 </div>
                 <div class="input-field">
                    <input name="sexo" id="sexo" type="text" class="validate">
                    <label for="sexo">Sexo</label>
                 </div>
                 <div class="input-field">
                    <input name="fechaNac" id="fechaNac" type="text" class="validate">
                    <label for="fechaNac">Fecha de nacimiento</label>
                 </div>
                 
                 
                  <p class="center-align">Ingresar Enfermedad</p>
                  <div class="input-field">
                    <input name="nombreEnf" id="nombreEnf" type="text" class="validate">
                    <label for="nombreEnf">Nombre de Enfermedad</label>
                 </div>
                  <div class="input-field">
                    <input name="descripcion" id="descripcion" type="text" class="validate">
                    <label for="descripcion">Descripción</label>
                 </div>
                  <div class="input-field">
                    <input name="tiempoDuracion" id="tiempoDuracion" type="text" class="validate">
                    <label for="tiempoDuracion">Tiempo de Duracion</label>
                 </div>
                  <div class="input-field">
                    <input name="tratamiento" id="tratamiento" type="text" class="validate">
                    <label for="tratamiento">Tratamiento</label>
                 </div>
                  <button type="submit" class="btn right">Agregar</button>
                 <br/><br/>
                 
             </form>
             <a href="index.jsp"><button type="submit" class="btn left">Volver</button></a>
             <p>
                 ${requestScope.msg}
             </p>
             
         </div>
 
    </div>

<%@include file="templates/footer.jsp" %>