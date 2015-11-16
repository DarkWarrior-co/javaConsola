package pc;
public class Computadora {
    String marca, capacidad, ram, procesador;
    public Computadora(String marca, String capacidad, String ram, String procesador) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.ram = ram;
        this.procesador = procesador;
    }
    public Computadora(){
        marca="Samsung";
        capacidad="500Gb";
        ram="4 Gb";
        procesador="Intel";
    }
    public String Encencer() {
        return"Estoy encendido =)";
    }
    public String Apagar() {
       return "Estoy apagado =/";
    }
    public String mostrar(){
     return "Caracteristicas del equipo \nMarca:"+marca+"\nCapacidad:"+capacidad+"\nRam:"+ram+"\nProcesador"+procesador;
    }
}
