package vehiculos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Autos auto = new Autos(null, null, null);
        Camionetas camio = new Camionetas(null, null, null);
        System.out.println("Digita los valores de el auto...");
        System.out.println("Digita el numero de patente del auto...");
        auto.numeroPatente = read.nextLine();
        System.out.println("Digita la marca del auto...");
        auto.marca=read.nextLine();
        System.out.println("Digita el año de fabricacion del auto");
        auto.añoFabricacion = read.nextLine();
        System.out.println("Digita la capacidad de combustible");
        auto.capacidadCombustible = read.nextDouble();
        System.out.println("Digita la lectura de kilometraje del auto");
        auto.lecturaKilometros = read.nextDouble();
         
        System.out.println("Digita los valores de la camioneta");
        System.out.println("Digita el numero de patente del auto...");
        camio.numeroPatente = read.nextLine();
        System.out.println("Digita la marca de la camioneta...");
        camio.marca=read.nextLine();
        System.out.println("Digita el año de fabricacion de la camioneta");
        camio.añoFabricacion = read.nextLine();
        System.out.println("Digita la capacidad de carga de la camioneta..");
    }
}
