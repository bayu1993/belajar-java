public class Calculator {
    /*declare variable*/
    int resultAddition;
    /*create new method addition
    * @return int
    * @param int number1 and number2*/
    public int addition(int number1, int number2){
        resultAddition = number1 + number2;
        System.out.println("====== Penjumlahan ======");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println("=========  +");
        System.out.println(resultAddition);
        return resultAddition;
    }
}
