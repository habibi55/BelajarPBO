import javax.swing.*;

public class Pert1c {
    public static void main(String[] args) {
        int bil=Integer.valueOf(JOptionPane.showInputDialog("Masukkan Bil "));
        if(bil%2==0){
            JOptionPane.showMessageDialog(null, bil+" Adalah Genap");
        }
        else {
            JOptionPane.showMessageDialog(null, bil+" Adalah Ganjil");
        }
    }
}
