
package modelo;


public class Veterinario {
private String rut;
private String nombre;
private String apellido;
private int edad;
private String sexo;
private String ciudad;
private int telefFijo;
private int telefCel;
private  String direccionComercial;
private String especialidad;

    public Veterinario() {
    }

    public Veterinario(String rut, String nombre, String apellido, int edad, String sexo, String ciudad, int telefFijo, int telefCel, String direccionComercial, String especialidad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.ciudad = ciudad;
        this.telefFijo = telefFijo;
        this.telefCel = telefCel;
        this.direccionComercial = direccionComercial;
        this.especialidad = especialidad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefFijo() {
        return telefFijo;
    }

    public void setTelefFijo(int telefFijo) {
        this.telefFijo = telefFijo;
    }

    public int getTelefCel() {
        return telefCel;
    }

    public void setTelefCel(int telefCel) {
        this.telefCel = telefCel;
    }

    public String getDireccionComercial() {
        return direccionComercial;
    }

    public void setDireccionComercial(String direccionComercial) {
        this.direccionComercial = direccionComercial;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

        
}
