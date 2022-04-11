public class Array2D {
    public static void main(String args[]) {
    String[][] informasi ={{"Atsal","2110651101"},
                           {"Benny","2110651102"},
                           {"Citra","2110651103"},
                           {"Danu","2110651104"},
                           {"Elang","2110651105"},
                           {"Fauzan","2110651106"},
                           {"Galuh","2110651107"},
                           {"Hidayat","2110651108"},
                           {"Indira","2110651109"},
                           {"Jessica","2110651110"}};
    //Memberi tabel keterangan atas NAMA dan NIM
        System.out.println("NAMA MAHASISWA\tNIM");
    //Perulangan untuk menampilkan array 2D dari "informasi"
        for(int y=0;y<10;y++){
            for(int x=0;x<2;x++){
            System.out.format("%s\t\t",informasi[y][x]);//%s untuk mengambil variablel disamping berupa string
            }
        System.out.println();
        }
    }
}