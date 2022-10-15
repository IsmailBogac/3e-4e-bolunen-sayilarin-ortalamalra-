import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k,total=0,llong=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        k = input.nextInt();
        for (int i = 1; i <= k; i++){
            if (i %3 ==0  && i % 4 == 0) {
                System.out.println("Üç'e ve Dört'e tam bölünen sayı :"+i);
                total += i;
                llong ++;

            }

        }
        System.out.println(total/llong);
    }
}