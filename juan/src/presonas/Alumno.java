package presonas;
public class Alumno extends Presonas {
    String gradoEstudio;
    public Alumno(String nombre, String edad, String gradoEstudio) {
        super(nombre, edad);
        this.gradoEstudio = gradoEstudio;
    }
    @Override
    public String mostrar() {
        return super.mostrar()+"\nTu grado de estudio: " + gradoEstudio;
    }
}
