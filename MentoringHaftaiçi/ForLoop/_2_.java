package MentoringHaftaiçi.ForLoop;

import java.util.Scanner;

public class _2_ {
    public static void main(String[] args) {
        /*
Kullanıcının girdigi sayının çarpım tablosunu yazınız. (10 a kadar)

Konsol örneği:
Pozitif int değeri girin :5
Çarpım tablosu :  5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
 */

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir int değeri giriniz :  ");

        int num = sc.nextInt();

        for (int i = 1; i <=10 ; i++) {

            System.out.println(num + " x " +i + " = " + (num * i));
        }

    }
}
