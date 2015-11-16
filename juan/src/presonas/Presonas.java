package presonas;

public class Presonas {

    String nombre;
    String edad;

    public Presonas(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public   String mostrar() {
        return ("Datos de la persona " + "\nTu nombre es: " + nombre+"\nEdad: "+edad);
    }
}
