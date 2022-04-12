/**
 *
 * @author PROG 33
 */
public class Pegawai extends Manusia{
    String nip;
    String bidangBagian;
    String gaji;
    
    public void setGaji(String gaji){
        this.gaji = gaji;
    }
    public String getGaji(){
        return gaji;
    }
    public Pegawai(){
    }
    public Pegawai(String nip, String bidangBagian){
        this.nip = nip;
        this.bidangBagian = bidangBagian;
    }
    public void status(String Status){
        System.out.println(Status);
    }   
}