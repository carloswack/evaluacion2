
package modelo;


public class Mascota {
    private String id;
    private String nombreMasc;
    private String especie;
    private String raza;
    private int edad;
    private String sexo;
    private String fechaNac;

    public Mascota() {
    }

    public Mascota(String id, String nombreMasc, String especie, String raza, int edad, String sexo, String fechaNac) {
        this.id = id;
        this.nombreMasc = nombreMasc;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreMasc() {
        return nombreMasc;
    }

    public void setNombreMasc(String nombreMasc) {
        this.nombreMasc = nombreMasc;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
}
