import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pert1d {
    public static void main(String[] args) {
        int bil=0;
        BufferedReader terserah=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Masukkan Bilangan : ");
        try {
            bil=Integer.parseInt(terserah.readLine());
        }
        catch (IOException E){
            System.out.println("Erorr!");
        }

        if (bil%2==0){
            System.out.println(bil+ " Adalah Bil Genap");
        }
        else {
            System.out.println(bil+ " Adalah bil Ganjil");
        }
    }
}
