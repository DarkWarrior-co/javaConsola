package Taller2;
public class punto5 {
    public static void main(String[] args) {
        int [][] a = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int) (Math.random() * 500 + 1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
