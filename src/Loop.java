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
        Scanner newInput = new Scanner(System.in);

        System.out.print("ketikkan nomor pertama :");
        int firstNumber = newInput.nextInt();

        System.out.print("ketikkan nomor kedua :");
        int secondNumber = newInput.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("nomor pertama lebih besar");
        }else if (firstNumber == secondNumber){
            System.out.println("nomor pertama == nomor kedua");
        }else {
            System.out.println("nomor kedua lebih besar rupanya");
        }
    }

}
