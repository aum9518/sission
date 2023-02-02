import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mas = {3,3,9,3,6};
        System.out.println(Arrays.toString(mas));
        System.out.println(booleanMethod(mas));

    }
    static boolean booleanMethod(int mas[]){

        int[] mas1=new int[mas.length];

        for (int i=0;i< mas.length;i++) {
            int count = 1;
            for (int j=i+1;j<mas.length;j++){

                for (int k=j+1;k< mas.length;k++){
                    if (mas[i]==mas[j]){
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
