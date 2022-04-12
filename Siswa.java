/**
 *
 * @author Danuarta
 */
public class Siswa extends Manusia{
    private String nis;
    private String kelas;
    private String waliKelas;

    public Siswa(){}
    
    public Siswa(String nis, String kelas, String waliKelas){
        this.nis = nis;
        this.kelas = kelas;
        this.waliKelas = waliKelas;
    }
    
    public String getNis(){
        return nis;
    }
    public void setNis(String nis){
        this.nis = nis;
    }
    public String getKelas(){
        return kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public String getWalikelas(){
    return waliKelas;
    }
    public void setWalikelas(String waliKelas){
        this.waliKelas = waliKelas;
    }
    
    public void status(){
        System.out.println("sedang belajar");
    }  
}