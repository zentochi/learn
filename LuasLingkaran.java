package com.pbo.tugas2;
import javax.swing.JOptionPane;
/**
 *
 * @author Danuarta
 */
public class LuasLingkaran {
    public static void main(String[] args) { 
    double phi = 3.14;
    double luas,jarijari;
    int confirm;
    
    JOptionPane.showMessageDialog(null,"Program menghitung Luas Lingkaran");
    do{
    jarijari = Double.parseDouble(JOptionPane.showInputDialog(null,"Masukkan Jari-jari"));
    luas = jarijari*jarijari*phi;
    JOptionPane.showMessageDialog(null, "Luas lingkaran adalah "+luas);
    confirm = JOptionPane.showConfirmDialog(null, "Ingin mengulangi?","Konfirmasi",JOptionPane.YES_NO_OPTION);
    }while(confirm == JOptionPane.YES_OPTION);
    while(confirm == JOptionPane.NO_OPTION){
    JOptionPane.showMessageDialog(null, "Program selesai !");
    System.exit(0);
    }
  }
}
