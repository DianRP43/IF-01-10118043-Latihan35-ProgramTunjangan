/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Karyawan {
    public  double tunjang;
    public  double totalGaji = 0;
    public double hitungTunjangan(double gaji) {
        return gaji * 0.35;
    }

    public void hitungGaji(double parGaji, String parStatus) {
        if(parStatus.toUpperCase().equals("MENIKAH")){
            tunjang = hitungTunjangan(parGaji);
        }
        else{
            tunjang = 0;
        }
        totalGaji = parGaji + tunjang;
}

}
