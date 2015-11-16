package vehiculos;
public class Camionetas extends Vehiculos{
double capacidadCarga;    
    public Camionetas(String numeroPatente, String marca, String añoFabricacion) {
        super(numeroPatente, marca, añoFabricacion);
        this.capacidadCarga=capacidadCarga;
    }
@Override
public int Acelerar() {
        
        return 0;
    }
@Override
    public int frenar() {

        return 0;
    }
}
