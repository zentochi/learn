import javax.swing.*;
/**
 *
 * @author Danuarta
 */
public class BelajarJavaxSwing {
public static void main(String[]args){
String nama;
int angka=0, sisa=0;

nama=JOptionPane.showInputDialog("benda apakah yang disukai anak-anak dan mudah meletus?");
angka= Integer.parseInt(JOptionPane.showInputDialog("Berapakah jumlah sila pada pancasila"));
sisa=Integer.parseInt(JOptionPane.showInputDialog("Angka berapakah sebelum angka 5?"));
JOptionPane.showMessageDialog(null,"Selamat anda dapat mengisi missing lyric berikut :\n"+nama+"ku ada "+angka+" rupa-rupa "
+"warnanya merah kuning kelabu merah muda dan biru, meletus balon hijau dor, hatiku sangat kacau balonku "
+"tinggal "+sisa+" ku pegang erat-erat" );


}  
}
