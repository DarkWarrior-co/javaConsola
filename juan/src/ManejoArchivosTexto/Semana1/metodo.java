package ManejoArchivosTexto.Semana1;
public class metodo {
    public static void main(String[] args) {
        String a = "juan";
        int edad = 20;
        int r = azul(a, edad);
        System.out.println("La respuesta es "+ r);
    }
    static int azul(String a, int edad) {
        int x;
        x = a.length() * edad;
        return x;
    }
}
