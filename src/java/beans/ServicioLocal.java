
package beans;

import java.util.ArrayList;
import javax.ejb.Local;
import modelo.*;

@Local
public interface ServicioLocal {
   
    Veterinario addVeterinario(Veterinario veterinario);

    void addMascota(Mascota mascota);

    void addEnfermedad(Enfermedad enfermedad);
   
    ArrayList<Veterinario> getVeterinarios();
    
    ArrayList<Mascota> getMascotas();

    ArrayList<Enfermedad> getEnfermedad();

   
}
