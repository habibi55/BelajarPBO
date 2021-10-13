

import javax.swing.JOptionPane;

public class Pert1a {
    public static void main(String[] args) {
        double pi,r,luas;
        pi =Double.valueOf(JOptionPane.showInputDialog("Masukkan Input: "));
        r =Double.valueOf(JOptionPane.showInputDialog("Masukkan Input: "));
        luas = pi*r*r;


        JOptionPane.showMessageDialog(null, "Luas Lingkaran : " + luas);

    }
}
