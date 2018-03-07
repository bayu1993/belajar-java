public class Main {
    public static void main(String[] args) {
        // Mobil : nama Class
        // avanza : nama object
        /* new Mobil() : Constructor : method yang namanya sama dengan nama class
        * fungsi :
        * - menentukan nilai awal
        * - instansiasi object
        * # struktur penulisan
        * NamaClass namaObject = new Constructor
        *
        * applikasi calculator
        *
        * kapan kita inisialisasi variable di Constructor?
        * sering dipake dan dinamis
        * not static*/
        Mobil avanza = new Mobil(); //membuat object avanza dengan nilai == Class Mobil
        avanza.print();
    }
}
