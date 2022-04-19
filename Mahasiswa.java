package com.belajar;
/**
 *
 * @author Danuarta
 */
public class Mahasiswa extends Manusia {
    private String nim;
    private String Jurusan;
    
    public Mahasiswa(){}
    
    public Mahasiswa(String nim, String Jurusan){
        this.nim = nim;
        this.Jurusan = Jurusan;
    }
    
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getJurusan(){
        return Jurusan;
    }
    public void setJurusan(String Jurusan){
        this.Jurusan = Jurusan;
    }
    
    public void status(String Status){
        System.out.println(Status);
    }
}