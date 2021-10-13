import javax.swing.*;

public class Pert2a {
    public static void main(String[] args) {
        //seorang pegawai akan

        double bonus,hargatoko,hargajual;
        hargatoko = Double.valueOf(JOptionPane.showInputDialog("Masukkan harga toko : "));
        hargajual = Double.valueOf(JOptionPane.showInputDialog("Masukkan harga jual : "));
        if (hargajual>hargatoko){
            bonus=0.05*hargajual;
            JOptionPane.showMessageDialog(null, "Selamattt... Bonus anda : " + bonus);
        }
        else {
            bonus=0;
            JOptionPane.showMessageDialog(null, "Maaf bonus anda Rp." + bonus + " Coba truss yaa ");
        }
    }
}
