package ManejoArchivosTexto.Semana1;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
// <applet width="400" height="200" code="AppletArreglos1"></applet>
public class AppletArreglos1 extends Applet implements ActionListener {

    Label l1, l2, l3;
    Button b1, b2, b3, b4;
    TextField t1, t2, t3;
    TextArea ta1;
    int[] numeros = new int[50];
    String[] nombre = new String[50];
    float[] saldo = new float[50];
    int c = 0;
    public AppletArreglos1() {
        l1 = new Label("Numero");
        t1 = new TextField("", 20);
        l2 = new Label("Nombre");
        t2 = new TextField("", 20);
        l3 = new Label("Saldo");
        t3 = new TextField("", 20);
        ta1 = new TextArea(20, 20);
        b1 = new Button("Añadir");
        b2 = new Button("Muestra Vector");
        b3 = new Button("Limpia Vector");
        b4 = new Button("Limpia Campos");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(ta1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b3) {
            ta1.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            c = 0;
            int[] numeros = new int[50];
            String[] nombre = new String[50];
            float[] saldo = new float[50];
            showMessageDialog(null, "la limpieza correcta");
        }
        if (ae.getSource() == b1) {
            if (c < numeros.length) {
                numeros[c] = Integer.parseInt(t1.getText());
                nombre[c] = t2.getText();
                saldo[c] = Integer.parseInt(t3.getText());
                c += 1;
                showMessageDialog(null, "Añadido correctamente");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                ta1.setText("");
            } else {
                ta1.setText("No se puede añadir otro elemento ");
            }
        }
        if (ae.getSource() == b2) {
            for (int i = 0; i < c; i++) {
                ta1.append("" + numeros[i] + " " + nombre[i] + " " + saldo[i] + "\n");
            }
        }
        if (ae.getSource() == b4) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            ta1.setText("");
        }
    }
}
