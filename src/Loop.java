import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int [] numbers ={12,23,4323,123,1,1543};
        String [] names = {"alex","nero","beri","agung","chris","Elon","Steve"};
        for (int a : numbers){
            System.out.print(a + " ");
        }
        System.out.println();
        for (String newName :names){
            System.out.print(newName + " ");

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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Roda : " );
        int jumlahRoda = input.nextInt();
        if (jumlahRoda <= 2){
            System.out.println("Lahan sebelah kiri");
        }else if (jumlahRoda <= 4){
            System.out.println("Lahan sebelah kanan");
        }else{
            System.out.println("Basement");
        }

        /*switch (jumlahRoda){
            case 2 :
                System.out.println("kanan");
                break;
            case 4 :
                System.out.println("kiri");
                break;
            default:
                System.out.println("basement");

        }*/
    }
}
