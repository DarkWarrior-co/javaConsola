package ManejoArchivosTexto.Semana1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
// <applet width="400" height="200" code="AppletArreglos1"></applet>

public class AppletArreglos2 extends Applet implements ActionListener {

    Label l1, l2, l3;
    Button b1, b2, b3, b4, mayor, menor, promedio, buscar;
    TextField t1;
    TextArea ta1;
    TextArea ta2;
    boolean esta = false;
    float[] numeros = new float[50];
    int c = 0;

    public AppletArreglos2() {
        l1 = new Label("Dato a añadir/buscar");
        t1 = new TextField("", 10);
        l2 = new Label("Texto para ver arreglo");
        ta1 = new TextArea(10, 20);
        b1 = new Button("Añadir");
        b2 = new Button("Muestra Vector");
        b3 = new Button("Limpia Vector");
        b4 = new Button("Limpia Campos");
        mayor = new Button("Mayor");
        menor = new Button("Menor");
        promedio = new Button("Promedio");
        buscar = new Button("Buscar...");
        l3 = new Label("Resultados:");
        ta2 = new TextArea(10, 20);
        add(l1);
        add(t1);
        add(l2);
        add(ta1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(mayor);
        add(menor);
        add(promedio);
        add(buscar);
        add(l3);
        add(ta2);
        buscar.addActionListener(this);
        b1.addActionListener(this);
        menor.addActionListener(this);
        mayor.addActionListener(this);
        promedio.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            if (c < numeros.length) {
                numeros[c] = Integer.parseInt(t1.getText());
                c += 1;
                showMessageDialog(null, "Añadido correctamente");
                t1.setText("");
                ta1.setText("");
            } else {
                ta1.setText("No se puede añadir otro elemento ");
            }
        } else if (ae.getSource() == buscar) {
            ta2.append("");
            for (int i = 0; i < c; i++) {
                if (numeros[i] == Integer.parseInt(t1.getText())) {
                    esta = true;i=c;
                    System.out.println("Esta"+esta+"cual"+t1.getText());
                } else {
                    esta = false;
                    System.out.println("HNo esta "+i+"esta"+esta);
                }
            }
            if (esta == true) {
                ta2.append("El numero " + t1.getText() + " Si esta " + "\n");
            } else if(esta==false) {
                ta2.append("El numero " + t1.getText() + " no esta " + "\n");
            }
        }
        if (ae.getSource() == b2) {
            for (int i = 0; i < c; i++) {
                ta1.append("" + numeros[i] + "\n");
            }
        }
        if (ae.getSource() == mayor) {
            double mayor = 0, a = 0;
            ta2.append("");
            for (int i = 1; i < c; i++) {
                if (numeros[i] > numeros[i - 1]) {
                    mayor = numeros[i];
                    a = i;
                } else if (numeros[i] < numeros[i - 1]) {
                    mayor = numeros[i - 1];
                    a = i - 1;
                }
            }
            a = a + 1;
            ta2.append("El numero " + mayor + " es el mayor \n En la posicion " + a);
        }
        if (ae.getSource() == promedio) {
            float q = 0;
            ta2.append("");
            for (int i = 0; i < c; i++) {
                q = numeros[i] + q;
            }
            q = q / c;
            ta2.append("el promedio es " + q);
        }
        if (ae.getSource() == menor) {
            double mayor = 0, a = 0;
            ta2.append("");
            for (int i = 1; i < c; i++) {
                if (numeros[i] < numeros[i - 1]) {
                    mayor = numeros[i];
                    a = i - 1;
                } else if (numeros[i] > numeros[i - 1]) {
                    mayor = numeros[i - 1];
                    a = i - 1;
                }
            }
            ta2.append("El numero menor es " + a + "\n");
        }
    }
}
