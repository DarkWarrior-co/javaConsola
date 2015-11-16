package ManejoArchivosTexto.Semana2;
import java.util.Scanner;
public class AplicacionMatriz1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digita el numero de renglones/columnas");
        int a = read.nextInt();
        int j = 0, i = 0, q = 0;
        double c = 0, f = 0, d = 0;
        double[][] matriz = new double[a][a];
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                System.out.println("Digita un numero en la casilla " + i + " " + j + "...");
                matriz[i][j] = read.nextInt();
            }
        }
        for (i = 0; i < a; i++) {

            for (j = 0; j < a; j++) {
                System.out.println(matriz[i][j] + " ");
                c = c + matriz[q][j];
                f = f + matriz[i][q];
                if (i == j) {
                    d = d + matriz[i][j];
                }
                q += 1;
            }
            q = 0;
            System.out.println();
        }
        d = d * 4;
        if ((f == c) && (c == d)) {
            System.out.print("La matriz es un cuadrado magico");
        } else {
            System.out.println("La matriz no es un cuadrado magico");
        }
    }
}
