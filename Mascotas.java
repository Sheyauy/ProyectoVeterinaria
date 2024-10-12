public class Mascotas {
    private String nombre, tipoAnimal;
    private int edad;
    private float peso;
    private Duenio duenio;

    public Mascotas(String nombre, String tipoAnimal, int edad, float peso, Duenio duenio) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.edad = edad;
        this.peso = peso;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public void agregarServicios (Servicio servicio){
        System.out.println("Algo");
    }

    public void listarServicios (){
        System.out.println("Algo");
    }
}
