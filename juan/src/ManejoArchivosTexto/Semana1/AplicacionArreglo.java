package ManejoArchivosTexto.Semana1;
import java.util.Scanner;
public class AplicacionArreglo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char[] a = new char[8];
        char[] b = new char[5];
        int c = a.length, q = 0;
        System.out.println("Palabra 1");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Caracter " + i + " =");
            a[i] = read.nextLine().charAt(0);
        }
        c = c - 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[c]) {
                q += 1;
            }
            c = c - 1;
        }
        c = a.length;
        if (q == (c)) {
            
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es palidromo");
        }
        c = b.length;
        System.out.println("Palabra 2");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Caracter " + i + " =");
            a[i] = read.nextLine().charAt(0);
        }
        c=c-1;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == b[c]) {
                q += 1;
            }
            c = c - 1;
        }
        c = b.length;
        if (q == (c)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es palidromo");
        }

    }
}
