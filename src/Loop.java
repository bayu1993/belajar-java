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
