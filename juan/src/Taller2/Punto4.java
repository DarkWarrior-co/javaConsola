package Taller2;
public class Punto4 {
    public static void main(String[] args) {
        double[] a=new double[7];
      //  a=(double){12.0,0.0,2.0,5.0,6.0,7.0,10.0};
        double []resultado=new double[7];    
        for (int i = 0; i < resultado.length; i++) {
               if (a[i]%2==0) {
                   resultado[i]=(Math.pow(a[i], 2));
            }else if(a[i]%2!=0){
                   resultado[i]=(Math.pow(a[i], 3));
            }
        }
    }
}
