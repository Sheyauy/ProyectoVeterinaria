import java.util.LinkedList;
import java.util.List;

public class Veterinaria {

        private String nombreVeterinaria;
        private List<Duenio> listaDuenos;

    public Veterinaria(String nombreVeterinaria) {
        this.nombreVeterinaria = nombreVeterinaria;
        this.listaDuenos = new LinkedList<>();
    }

    // Método para agregar un dueño a la lista
    public void registrarDueño(Duenio duenio) {
        this.listaDuenos.add(duenio);
    }

    // Método para obtener la lista de dueños
    public List<Duenio> getListaDuenos() {
        return listaDuenos;
    }
}






