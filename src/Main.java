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
       /* Mobil avanza = new Mobil(); //membuat object avanza dengan nilai == Class Mobil
        avanza.print();*/

        //# create object from class Calculator and calling method addition
        //declare and inisialize new variable
        int number1 = 600;
        int number2 = 70;
        int resultAdd;

        //create object
        Calculator objCalc = new Calculator();
        //calling method with object
        resultAdd = objCalc.addition(number1,number2);
        System.out.println("====== Penjumlahan ======");
        System.out.println(number1 +" + "+number2+ " = "+resultAdd);
        System.out.println("==========================");
    }
}
