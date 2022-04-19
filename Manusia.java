package com.belajar;
/**
 *
 * @author Danuarta
 */
public class Manusia {
    private String nama;
    private int umur;
    private String jenisKelamin;
  
    public Manusia(){}
    
    public Manusia(String nama, int umur, String jk){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jk;
    }
    public String getNama(){
       return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public String getJenisKelamin(){
        return jenisKelamin; 
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public static void tertawa(String tawa){
        System.out.println(tawa);
    }
    public void status(){
    }
    
}
