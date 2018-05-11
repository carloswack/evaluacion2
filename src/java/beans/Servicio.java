package beans;

import javax.ejb.Singleton;
import modelo.*;
import java.util.ArrayList;

@Singleton
public class Servicio implements ServicioLocal {
    private ArrayList<Veterinario> veterinarios=new ArrayList();
    private ArrayList<Mascota> listaM=new ArrayList();
    private ArrayList<Enfermedad> listaE=new ArrayList();


    public Servicio() {
        veterinarios.add(new Veterinario ("19696418-8","Juan","Perez",48,"M","Punta Arenas",2223244,987766543,"AV. Sudireccion #0543","Mascotas"));
    }
    @Override
    public Veterinario addVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
        return null;
    }
    
    @Override
    public void addMascota(Mascota mascota) {
       listaM.add(mascota);
    }

    @Override
    public void addEnfermedad(Enfermedad enfermedad) {
        listaE.add(enfermedad);
    } 
    @Override
    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    @Override
    public ArrayList<Mascota> getMascotas() {
        return listaM;
    }

    @Override
    public ArrayList<Enfermedad> getEnfermedad() {
        return listaE;
    }
  
}
