import java.util.LinkedList;
import java.util.List;
public class Duenio {
    private String nombre, direccion;
    private String telefono;
    private List<Mascotas> listaMascotas;

    public Duenio(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaMascotas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    // Métodos para agregar y obtener mascotas
    public void agregarMascota(Mascotas mascota) {
        this.listaMascotas.add(mascota);
    }

    public List<Mascotas> getListaMascotas() {
        return listaMascotas;
    }



}
