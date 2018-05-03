
package beans;

import java.util.ArrayList;
import javax.ejb.Local;
import modelo.*;

@Local
public interface ServicioLocal {
   
    Veterinario addVeterinario(Veterinario veterinario);

    ArrayList<Veterinario> getVeterinarios();

    Mascota addMascota(Mascota mascota, String rut);

    Enfermedad addEnfermedad(Enfermedad enfermedad,String rut);

    ArrayList<Mascota> getMascotas(String rut);

    ArrayList<Enfermedad> getEnfermedad(String rut);

   
}
