import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360                                       */
         double yaricapr,merkezacia,alan; double pi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        yaricapr = scan.nextDouble();
        System.out.println("Dairenin merkez açısını giriniz : ");
        merkezacia = scan.nextDouble();
        alan = (pi*(yaricapr*yaricapr) * merkezacia) /360;
        System.out.println("Daire diliminin alanı : " + " "+  alan);


    }
}