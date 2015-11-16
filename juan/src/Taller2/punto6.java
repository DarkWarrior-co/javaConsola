package Taller2;
public class punto6 {
    public static void main(String[] args) {
                int [][] a = new int[6][5];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int) (Math.random() * 900 + 100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
   
}
