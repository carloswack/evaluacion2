<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="beans.ServicioLocal"%>
<%@page import="javax.naming.InitialContext"%>
<%! ServicioLocal servicio; %>

<%@include file="templates/header.jsp" %>
<%@include file="templates/menu.jsp" %>

 <div class="row">
    <div class="col s12 m5 offset-l3">
      <div class="card">
        <div class="card-image">
          <img src="images/vet.png">
        </div>
        <div class="card-content">
          <p>Veterinaria de calidad y dedicaci�n</p>
        </div>
      </div>
    </div>
  </div>

<%@include file="templates/footer.jsp" %>