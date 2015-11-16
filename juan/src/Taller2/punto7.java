package Taller2;
import java.util.Scanner;
public class punto7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digita las filas de la matriz");
        int f = read.nextInt();
        System.out.println("Digita las columnas de las matriz");
        int c = read.nextInt();
        int[][] a = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Digita un valor para la casilla " + i + " " + j + " ");
                a[i][j] = read.nextInt();
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
