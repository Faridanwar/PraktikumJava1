import javax.swing.JOptionPpane;
import java.util.Scanner;

public class DataTypes{
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        String namaDepan = "Muhammad";
        String namaTengah = "Farid";
        String namaBelakang = "Anwar";
        int usia = 19;
        int targetTahunKuliah = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.print("Input Nama Depan ");
        namaDepan = scanner.nextLine();
        System.out.print("Input Usia : ");
        usia = scanner.nextint();
        System.out.print("Input IPK: ");
        ipk = scanner.nextDouble();
        system.out.print("");
        System.out.print("Input Nilai Abjad : ");
        nilaiAbjad = scanner. next() .. charAt(0);
        System.out.print("Tampan? : ");
        tampan = scanner. nextBoolean(); 

        System.out.println("Nama depan : " + namaDepan);
        System.out.println("Nama tengah : " + namaTengah);
        System.out.println("Nama belakang : " + namaBelakang);
        System.out.println("Usia : " + usia);
        System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
        System.out.println("IPK : " + ipk);
        System.out.println("Nilai PBO : " + ipk);
        System.err.println("Tampan : " + tampan);

        JOptionPpane.showMessageDialog(null,"Hai, " + namaDean + namaTengah + namaBelakang);

    }
}