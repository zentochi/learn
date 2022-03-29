
import javax.swing.JOptionPane;
/**
*
* @author Danuarta
*/
public class LuasLingkaranSegitiga {
public static void main(String[] args) {
double phi = 3.14;
double luaslingkaran,luassegitiga,jarijari,alas,tinggi;
int confirm;
String pilihan;
JOptionPane.showMessageDialog(null,"Program menghitung Luas Lingkaran dan Segitiga");
do{ //blok perulangan jika dialog Ingin Mengulang ditekan YES
pilihan = JOptionPane.showInputDialog(null,"Ketik Segitiiga atau Lingkaran");
if(pilihan.equalsIgnoreCase("lingkaran")){
jarijari = Double.parseDouble(JOptionPane.showInputDialog(null,"Masukkan Jari-jari"));
luaslingkaran = jarijari*jarijari*phi;
JOptionPane.showMessageDialog(null, "Luas lingkaran adalah "+luaslingkaran);
}else if(pilihan.equalsIgnoreCase("segitiga")){
alas = Double.parseDouble(JOptionPane.showInputDialog(null,"Masukkan alas"));
tinggi = Double.parseDouble(JOptionPane.showInputDialog(null,"Masukkan tinggi"));
luassegitiga = alas*tinggi/2;
JOptionPane.showMessageDialog(null, "Luas Segitiga adalah "+luassegitiga);
}
confirm = JOptionPane.showConfirmDialog(null, "Ingin mengulangi?","Konfirmasi",
JOptionPane.YES_NO_OPTION);//<-merubah pilihan tombol ke YES dan No
}while(confirm == JOptionPane.YES_OPTION);//blok perulangan jika dialog "Ingin Mengulang" ditekan YES
while(confirm == JOptionPane.NO_OPTION){ //blok perulangan jika dialog "Ingin Mengulang" ditekan NO
JOptionPane.showMessageDialog(null, "Program selesai !");
System.exit(0);
}//blok perulangan jika dialog Ingin Mengulang ditekan NO
}