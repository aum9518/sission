import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mas = {2,2,2,8,5};
        System.out.println(Arrays.toString(mas));
        System.out.println(booleanMethod(mas));

    }
    static boolean booleanMethod(int mas[]){

        int[] mas1=new int[mas.length];
        int visited = -1;
        for (int i=0;i< mas.length;i++) {
            int count = 1;
            for (int j=i+1;j<mas.length;j++){
                count++;
                if (mas[i]==mas[j]){
                    count++;
                    mas1[j]=visited;
                }
            }
            if (visited==mas[i]){
                return true;
            }else {
                return false;
            }
        }
        return true;
    }
}