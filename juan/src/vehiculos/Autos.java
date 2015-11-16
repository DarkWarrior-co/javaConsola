package vehiculos;
public class Autos extends Vehiculos {
    double lecturaKilometros, capacidadCombustible;

    public Autos(String numeroPatente, String marca, String añoFabricacion) {
        super(numeroPatente, marca, añoFabricacion);
        this.capacidadCombustible = capacidadCombustible;
        this.lecturaKilometros=lecturaKilometros;
    }
    public int Acelerar() {
         
        return 0;
    }
    public int frenar() {

        return 0;
    }
}
