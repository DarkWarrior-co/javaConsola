package presonas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Read = new Scanner(System.in);
        Alumno a =  new Alumno(null,null,null);
        System.out.println("Digita el nombre ");
        a.nombre=Read.nextLine();
        System.out.println("Digita el edad ");
        a.edad=Read.nextLine();
        System.out.println("Digita el grado de escolaridad ");
        a.gradoEstudio=Read.nextLine();
        System.out.println(a.mostrar());
    }
}
