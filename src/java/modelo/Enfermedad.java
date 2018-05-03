
package modelo;


public class Enfermedad {
    private String nombreEnf;
    private String descripcion;
    private String tiempoDuracion;
    private String tratamiento;

    public Enfermedad() {
    }

    public Enfermedad(String nombreEnf, String descripcion, String tiempoDuracion, String tratamiento) {
        this.nombreEnf = nombreEnf;
        this.descripcion = descripcion;
        this.tiempoDuracion = tiempoDuracion;
        this.tratamiento = tratamiento;
    }

    public String getNombreEnf() {
        return nombreEnf;
    }

    public void setNombreEnf(String nombreEnf) {
        this.nombreEnf = nombreEnf;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(String tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
}
