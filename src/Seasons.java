import java.util.Scanner;

public class Seasons {

     void season(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num==12 || num==1 || num ==2){
            System.out.println("Kysh");
        } else if (num==3 || num==4 || num==5) {
            System.out.println("Jaz");
        } else if (num==6 || num==7 || num==8) {
            System.out.println("Jay");
        } else if (num==9 || num==10 || num==11) {
            System.out.println("Kuz");
        }else {
            System.out.println("Error");
        }
    }
}
