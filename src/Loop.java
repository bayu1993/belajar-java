import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int [] lantai ={0,3,2,3,4,5};
       // Scanner input = new Scanner(System.in);
       // System.out.println("dari lantai :");
        int posisi = 1;
      //  System.out.println("ke lantai : ");
        int tujuan = ;
        for (int a=posisi;a <= tujuan; a++){
            int indexLantai = lantai[a];
            System.out.println("kamu berada di lantai "+indexLantai);
        }
    }

}
class Condition{
    public static void main(String[] args) {
        Condition newObject = new Condition();
        Scanner newInput = new Scanner(System.in);

        System.out.print("ketikkan nomor pertama :");
        int firstNumber = newInput.nextInt();

        System.out.print("ketikkan nomor kedua :");
        int secondNumber = newInput.nextInt();

        newObject.minMax(firstNumber,secondNumber);

        System.out.println("Apakah anda ingin coba lagi?(y or n)");
        String keputusan = newInput.next();
        switch (keputusan){
            case "y":
                System.out.println("kamu pilih yes");
                System.out.print("ketikkan nomor pertama :");
                firstNumber = newInput.nextInt();

                System.out.print("ketikkan nomor kedua :");
                secondNumber = newInput.nextInt();

                newObject.minMax(firstNumber,secondNumber);
                break;
            case "n":
                System.out.println("kamu pilih no");
                System.out.println("thanks for try this simple program");
                break;
            default:
                System.out.println("please enter y or n");
        }

    }
    public void minMax(int num1, int num2){
        if (num1 > num2){
            System.out.println("nomor pertama lebih besar");
        }else if (num1 == num2){
            System.out.println("nomor pertama == nomor kedua");
        }else {
            System.out.println("nomor kedua lebih besar rupanya");
        }
    }

}
class Parkir{
    void parkirSystem(int jumlahRoda){
        if (jumlahRoda <= 2){
            System.out.println("Lahan sebelah kiri");
        }else if (jumlahRoda <= 4){
            System.out.println("Lahan sebelah kanan");
        }else{
            System.out.println("Basement");
        }
    }
}
