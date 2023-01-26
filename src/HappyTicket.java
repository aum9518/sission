import java.util.Scanner;

public class HappyTicket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int a = number%10;
        int b = number%100/10;
        int c = (number%1000)/10/10;
        int d = (number%10000)/10/10/10;
        int e = (number%100000)/10/10/10/10;
        int f = (number%1000000)/10/10/10/10/10;

        int sum=f+e+d;
        int sum1=c+b+a;
        System.out.println(sum);
        System.out.println(sum1);
        if (sum%2==0 && sum1%2==0){
            System.out.println("baktyluu bilet");
        }else {
            System.out.println("jonokoi bilet");
        }
    }
}
