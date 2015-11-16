package Personas;
public class Persona {
    String colorOjos, colorCabello;
    double estatura;
    public Persona(String colorOjos, String colorCabello, double estatura) {
        this.colorCabello = colorCabello;
        this.colorOjos = colorOjos;
        this.estatura=estatura;
    }
    public Persona() {
      estatura=1.70;
    }
    public String walk() {
        return "camimando";
    }
    public String eat() {
        return "Comiendo";
    }
    public String show() {
        return (/*"D atos de persona... \nColor de ojos " + colorOjos + "\nColor de cabello " + colorCabello + "\n"*/"Estatura " + estatura);
    }
}
