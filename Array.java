package belajargan;
/**
 *
 * @author Danuarta
 */
public class Array {
    public static void main(String[] args) {
        int umur[]= {4,3,2};
        double ratarata=0;
            for(int i=0;i<umur.length;i++){
            ratarata=ratarata+umur[i];
                System.out.println("Jumlah siswa kelas strawberry ada "+umur.length);
            }
        ratarata=ratarata/umur.length;
        System.out.println("Rata-rata usia kelas strawberry adalah "+ratarata);
    }   
}