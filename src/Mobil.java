public class Mobil {
    /*Tipe data
    * String = text, menggunakan ("")
    * Integer = number (non desimal)
    * Long = number (kapasitas)
    * Float = number menggunakan komah (desimal)
    * Double = number komah (kapasitas)
    * Boolean = true / false
    *
    * char = karakter
    * int = number
    * daouble =
    * float =
    * long =
    * boolean =
    *
    * rule kapan kita pake primitif
    * String (yg pake huruf besar)untuk class dan int untuk variable (code version)*/
    /*Integer umur = 25;
    int umurSoni = 20;

    Double beratBadan = 60.3;
    double tinggiBadan = 170.5;*/

    int jumlahRoda = 4;
    boolean mesinDepan = true;
    String warna = "merah";
    boolean setirBulat = true;
    boolean pintuBukaAtas = true;
    int jmlPintu = 4;
    int jmlKnalpot = 2;
    int jmlTempatDuduk = 4;

    /*Method
    * modifier : syntax (orange color)
    * access modifier : memberikan access pada object
    * public    : bisa diakses oleh semua class
    * private   : cuman bisa dipanggil pada kelas itu sendiri
    * protected :
    * default   : hanya dapat di access 1 package
    * kpn kita gunakan?
    * private : memang digunakan kelas itu sendiri, jika di butuhkan oleh class lain
    * penamaan method == penamaan variable
    * pemanggilan
    *
    * return value : mengembalikan nilai
    * void : tidak mengembalikan nilai
    *
    * tahapan development
    *
    * maintain memory
    * codingan brantakan
    *
    * psvm > sortcut method main
    *
    * static itu nempel ke memory
    * jadi walaupun itu tentang tidak dipakai tetap dialokasikan memory
    * hanya bisa menjalankan method2 atau variable static*/
    /*public static void main(String[] args){
        System.out.println("Mobil saya");
        int jumlahTempatDuduk = 8;
        System.out.println("Jumlah tempat duduk "+jumlahTempatDuduk);

    }*/
    public void print(){
        System.out.println("jumlah roda: "+jumlahRoda);
        System.out.println("Warna mobil :"+warna);
    }

}
