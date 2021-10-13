import javax.swing.*;

public class Pert2c {
    public static void main(String[] args) {
        int nilai=Integer.valueOf(JOptionPane.showInputDialog("Masukkan nilai anda : "));
        if(nilai >= 80 & nilai <= 100){
            JOptionPane.showInputDialog(null, nilai+ " anda mendapat A");
        }
        else if (nilai>=70 & nilai <= 79){
            JOptionPane.showInputDialog(null, nilai+ " anda mendapat B");
        }
        else if(nilai>=55 & nilai <= 69){
            JOptionPane.showInputDialog(null, nilai+ " anda mendapat C");
        }
        else if(nilai>=40 & nilai <= 54){
            JOptionPane.showInputDialog(null, nilai+ " anda mendapat D");
        }
        else if(nilai>=0 & nilai <= 39){
            JOptionPane.showInputDialog(null, nilai+ " anda mendapat E");
        }
        else {
            JOptionPane.showInputDialog(null, "Hanya nilai 1-100");
        }
    }

}
