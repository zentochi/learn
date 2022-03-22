
import java.io.*;
/**
 *
 * @author Danuarta
 */
public class belajarBufferedReader {
public static void main(String[]args){
String nama="";
int angka=0, sisa=0;
BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
try{
    System.out.println("Benda apakah yang di sukai anak-anak dan mudah meletus? ");
    nama=dataIn.readLine();
    System.out.println("berapakah jumlah sila pada pancasila?"); 
    angka=Integer.parseInt(dataIn.readLine());
    System.out.println("Angka berapakah sebelum angka 5?");
    sisa= Integer.parseInt(dataIn.readLine());
}catch(IOException e){
        System.out.println("Ada kesalahan input/output");
    }
System.out.println(nama+"ku ada "+angka+" rupa-rupa warnanya merah kuning kelabu "
        + "merah muda dan biru, meletus balon hijau dor, hatiku sangat kacau balonku tinggal "+sisa+" ku pegang erat-erat" );
}
}
