package ManejoArchivosTexto.Semana2;

import java.util.Scanner;

public class AplicacionMatriz2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digita los renglones de la matriz...");
        int a = read.nextInt();
        System.out.println("Digita las columnas de la matriz...");
        int b = read.nextInt();
        int[][] f = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Digita un numero en la casilla " + i + " " + j + "...");
                f[i][j] = read.nextInt();
            }
        }
        System.out.println("Matriz original");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }
        a = a - 1;
        b = b - 1;
        int e = a, w = b;
        System.out.println("Matriz al revez");
        for (int i = 0; i <= b; i++) {
            for (int j = 0; j <= a; j++) {
                System.out.print(f[e][w] + " ");
                w = w - 1;
                
            }
            System.out.println("e"+e+" ");
            System.out.println();
            e = e - 1;
            w = b;     
        }
    }
}
