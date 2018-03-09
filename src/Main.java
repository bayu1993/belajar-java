import java.util.Scanner;

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
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan bilangan pertama : ");
        int number1 = inputUser.nextInt();
        System.out.println("Masukkan bilangan kedua : ");
        int number2 = inputUser.nextInt();
        int result;
        double resultDivision;

        //create new object
        Calculator objCalc = new Calculator();

        //calling method addition with object
        result = objCalc.addition(number1,number2);
        System.out.println("====== Penjumlahan ======");
        System.out.println(number1 +" + "+number2+ " = "+result);

        //calling method subtraction with object
        result = objCalc.subtraction(number1,number2);
        System.out.println("====== Pengurangan ======");
        System.out.println(number1 +" - "+number2+ " = "+result);

        //calling method multiplication with object
        result = objCalc.multiplication(number1,number2);
        System.out.println("======= Perkalian =======");
        System.out.println(number1 +" x "+number2+ " = "+result);

        //calling method division with object
        resultDivision = objCalc.division(number1,number2);
        System.out.println("======= Pembagian =======");
        System.out.println(number1 +" / "+number2+ " = "+resultDivision);

        Parkir newParkir = new Parkir();
        System.out.println("Jml Roda :");
        int jmlRoda = inputUser.nextInt();
        newParkir.parkirSystem(jmlRoda);
    }
}
