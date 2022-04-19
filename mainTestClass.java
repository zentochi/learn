package com.belajar;

import com.belajar.Pegawai;

/**
 *
 * @author Danuarta
 */
public class mainTestClass {
    public static void main(String[] args) {
        //Buat object
        Siswa siswaNabil=new Siswa();
        siswaNabil.setNama ("nabil");
        siswaNabil.setUmur (15);
        siswaNabil.setJenisKelamin("Laki-laki");
        siswaNabil.setNis ("11082011");
        siswaNabil.setKelas ("11a");
        siswaNabil.setWalikelas ("bambang, Spd, Mpd");//
        String infoSiswa="      INFO SISWA\n"+
                "nama : "+siswaNabil.getNama()+"\n"+
                "umur : "+siswaNabil.getUmur()+"\n"+
                "jenis Kelamin : "+siswaNabil.getJenisKelamin()+"\n"+
                "Nis : "+siswaNabil.getNis()+"\n"+
                "Kelas : "+siswaNabil.getKelas()+"\n"+
                "Wali Kelas : "+siswaNabil.getWalikelas();
        
        System.out.println(infoSiswa);
        siswaNabil.status();
        //pemanggilan object dari class pegawai
        Pegawai pegawaiDan = new Pegawai();
        pegawaiDan.setGaji("25000000");
       String infoPegawai = "Info Pegawai \n pegawai : Danuarta\n gaji : "+pegawaiDan.getGaji();
        System.out.println(infoPegawai);
        pegawaiDan.status();
    }
    
}
