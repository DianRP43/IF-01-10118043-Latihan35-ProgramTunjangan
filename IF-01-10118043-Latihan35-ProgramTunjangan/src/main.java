
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static double gajiPokok;
    public static String status;
    public static void main(String[] args) {
    // TODO code application logic here
    Karyawan kry = new Karyawan();
    Scanner scanner = new Scanner(System.in);
    
    //input
    System.out.println("===========Program tunjangan===========");
    System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
    gajiPokok = scanner.nextDouble();
                          
    System.out.print("Status Anda? (Menikah/Belum)\t : ");
    status = scanner.next();
    
    
    //proses
    kry.hitungGaji(gajiPokok, status);
    System.out.println("\n=========Hasil Perhitungan Gaji Anda=========");
    System.out.println("GajiPokok\t\t\t:Rp.  " + gajiPokok);
    System.out.println("Tunjangan\t\t\t: Rp. " + kry.tunjang);
    System.out.println("Total Gaji\t\t\t: Rp. " + kry.totalGaji);
    }
    
}
