import java.util.Scanner;

public class Loop {
    private int [] jmlLantai ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    private Scanner inputData = new Scanner(System.in);
    private void errorHandling(int posisi, int tujuan){
        if (posisi <= 0 || tujuan <= 0){
            System.out.println("Gedung ini hanya punya lantai 1 hingga 20");
            userInput();
        }else if (posisi > 20 || tujuan > 20){
            System.out.println("Gedung ini hanya punya lantai 1 hingga 20");
            userInput();
        }else if (posisi < tujuan){
            loopLiftUp(posisi,tujuan);
        }else if (posisi > tujuan){
            loopLiftDown(posisi, tujuan);
        }else {
            System.out.println("kamu tetap berada dilantai "+posisi);
            userKonfirmasi();
        }
    }
    void userInput(){
        System.out.println("Dari lantai :");
        int posisi = inputData.nextInt();
        System.out.println("Ke lantai :");
        int tujuan = inputData.nextInt();
        errorHandling(posisi,tujuan);
    }
    private void loopLiftUp(int posisi, int tujuan){
        for (int newPosisi=posisi; newPosisi<= tujuan; newPosisi++){
            int indexLantai = jmlLantai[newPosisi];
            System.out.println("Kamu berada di lantai "+indexLantai);
        }
        userKonfirmasi();
    }
    private void loopLiftDown(int posisi, int tujuan){
        for (int newPosisi=posisi; newPosisi>= tujuan; newPosisi--){
            int indexLantai = jmlLantai[newPosisi];
            System.out.println("Kamu berada di lantai "+indexLantai);
        }
        userKonfirmasi();

    }
    private void userKonfirmasi(){
        System.out.println("Apakah anda ingin naik lagi?(Y/N)");
        String jawaban = inputData.next();
        switch (jawaban){
            case "Y":
                userInput();
                break;
            case "N":
                System.out.println("Terimakasih telah menggunakan layanan kami");
                break;
            default:
                System.out.println("Silahkan jawab dengan input Y atau N");
                userKonfirmasi();
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
