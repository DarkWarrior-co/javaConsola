package pc;
import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        Computadora a=new Computadora(null, null, null, null);
        Computadora b=new Computadora();
        System.out.println("Digita la marca ");
        a.marca=read.nextLine();
        System.out.println("Digita la capacidad");
        a.capacidad=read.nextLine();
        System.out.println("Digita la ram");
        a.ram=read.nextLine();
        System.out.println("Digita el procesador");
        a.procesador=read.nextLine();
          System.out.println(a.Apagar());
          System.out.println(a.Encencer());
          System.out.println(a.mostrar());
          System.out.println("El otro");
          System.out.println(b.mostrar());
    }
}
