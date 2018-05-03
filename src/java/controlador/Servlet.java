
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;
import beans.ServicioLocal;
import javax.ejb.EJB;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @EJB
    private ServicioLocal servicio;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id=request.getParameter("id");
        String nombreMasc=request.getParameter("nombreMasc");
        String especie=request.getParameter("especie");
        String raza=request.getParameter("raza");
        String edadStr=request.getParameter("edad");
        String sexo=request.getParameter("sexo");
        String fechaNac=request.getParameter("fechaNac");
        String nombreEnf=request.getParameter("nombreEnf");
        String descripcion=request.getParameter("descripcion");
        String tiempoDuracion=request.getParameter("tiempoDuracion");
        String tratamiento=request.getParameter("tratamiento");
       
        int edad=0;
        try{
            edad=Integer.valueOf(edadStr);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        servicio.addMascota(new Mascota (id,nombreMasc,especie,raza,edad,sexo,fechaNac));
        servicio.addEnfermedad(new Enfermedad (nombreEnf,descripcion,tiempoDuracion,tratamiento));
        response.sendRedirect("agregar.jsp");
    }
}
